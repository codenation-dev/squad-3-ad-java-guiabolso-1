package com.errorscentral.guiabolso.controller;

import com.errorscentral.guiabolso.entity.Error;
import com.errorscentral.guiabolso.service.ErrorService;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/")
public class ErrorController {

    @Autowired
    private ErrorService errorService;


    @PatchMapping("error/{id}")
    @ApiResponses(value = {	@ApiResponse(code = 200, message = "Archived Error."),
                            @ApiResponse(code = 404, message = "Error Not Found"),
                            @ApiResponse(code = 400, message = "Request Not Done")})
    public ResponseEntity<Error> toFileError(@PathVariable(value = "id") Long id){
        try {
            Optional<Error> error = errorService.findError(id);
            if (error.isPresent()){
                Error log = new Error();
                log.setId(error.get().getId());
                log.setUserId(error.get().getUserId());
                log.setLevel(error.get().getLevel());
                log.setEvent(error.get().getEvent());
                log.setSystem(error.get().getSystem());
                log.setCreatedDate(error.get().getCreatedDate());
                log.setDetailsLog(error.get().getDetailsLog());
                log.setFiled(true);
                log.setUpdateDate(error.get().getUpdateDate());
                return new ResponseEntity<>(errorService.updateError(log), HttpStatus.OK);
            }
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }

    @GetMapping("error/{id}")
    @ApiResponses(value = {	@ApiResponse(code = 200, message = "Error Found"),
                            @ApiResponse(code = 404, message = "Error Not Found"),
                            @ApiResponse(code = 400, message = "Request Not Done")})
    public ResponseEntity<Optional<Error>> getError(@PathVariable(value = "id") long id){
        try{
            Optional<Error> error = errorService.findError(id);
            if(error.isPresent()){
                return new ResponseEntity<>(error, HttpStatus.OK);
            }
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

}
