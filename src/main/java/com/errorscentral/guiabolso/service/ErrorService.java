package com.errorscentral.guiabolso.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.errorscentral.guiabolso.entity.Error;
import com.errorscentral.guiabolso.repository.ErrorRepository;

@Service
public class ErrorService {
    
    @Autowired
    private ErrorRepository errorRepository;

    public Optional<Error> findError(Long id){
        return errorRepository.findById(id);
    }

    public Error updateError(Error error){
        return errorRepository.save(error);
    }
    
    public Page<Error> findAll(Pageable pageable){
    	return errorRepository.findAllErrors(pageable);
    	
    }
}
