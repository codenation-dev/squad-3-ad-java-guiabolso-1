package com.errorscentral.guiabolso.service;

import com.errorscentral.guiabolso.repository.ErrorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ErrorService {
    
    @Autowired
    private ErrorRepository errorRepository;


}
