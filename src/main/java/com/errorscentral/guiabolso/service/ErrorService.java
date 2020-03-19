package com.errorscentral.guiabolso.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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
    
    public List<Error> findAllErros(){
    	return errorRepository.findAll();
    	
    }
    public Error add(Error error) {
		return errorRepository.save(error);
	}
}
