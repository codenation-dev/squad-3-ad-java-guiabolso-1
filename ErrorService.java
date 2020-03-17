package com.errorscentral.guiabolso.service;

import com.errorscentral.guiabolso.entity.Error;
import com.errorscentral.guiabolso.repository.ErrorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

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

	public Error add(Error error) {
		return errorRepository.save(error);
	}
}
