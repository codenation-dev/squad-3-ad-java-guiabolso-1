package com.errorscentral.guiabolso.controller;

import com.errorscentral.guiabolso.component.*;
import com.errorscentral.guiabolso.entity.User;
import com.errorscentral.guiabolso.security.JwtRequest;
import com.errorscentral.guiabolso.security.JwtResponse;
import com.errorscentral.guiabolso.security.JwtThrowsException;
import com.errorscentral.guiabolso.security.JwtTokenUtil;
import com.errorscentral.guiabolso.service.UserService;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/")
public class UserController {
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private DecodeBase64 decodeBase64;

    @Autowired
    private UserService userService;

    @Autowired
    private JwtThrowsException jwtThrowsException;

    @PostMapping("login")
    @ApiResponses(value = {	@ApiResponse(code = 200, message = "Authenticated user.") })
    public ResponseEntity login(@RequestBody JwtRequest request) throws Exception{
         jwtThrowsException.authenticate(request.getEmail(), decodeBase64.decode(request.getPassword()));
         return ResponseEntity.ok(new JwtResponse(jwtTokenUtil.generateToken(request.getEmail())));
    }

    @PostMapping("register")
    @ApiResponses(value = {	@ApiResponse(code = 200, message = "Successfully registered.")} )
    public ResponseEntity saveUser(@RequestBody User user) throws Exception {
        return ResponseEntity.ok(userService.save(user));
    }
}
