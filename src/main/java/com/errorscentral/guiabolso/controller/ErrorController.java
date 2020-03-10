package com.errorscentral.guiabolso.controller;

import com.errorscentral.guiabolso.service.ErrorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/")
public class ErrorController {

    @Autowired
    private ErrorService errorService;
}
