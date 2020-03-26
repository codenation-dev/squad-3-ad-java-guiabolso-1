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
    	return errorRepository.findByFiled(false);

    }
    public Error add(Error error) {
		return errorRepository.save(error);
	}

    public List<Error> listErrorFilter(String environment, String level, String event) {
        if (!environment.equals("null") && !level.equals("null") && !event.equals("null")) {
            return errorRepository.findByLevelContainingIgnoreCaseAndEventContainingIgnoreCaseAndEnvironmentContainingIgnoreCase(level, event, environment);
        } else if (!environment.equals("null") && !level.equals("null")) {
            return errorRepository.findByLevelContainingIgnoreCaseAndEnvironmentContainingIgnoreCase(level, environment);
        } else if (!environment.equals("null") && !event.equals("null")) {
            return errorRepository.findByEventContainingIgnoreCaseAndEnvironmentContainingIgnoreCase(event, environment);
        } else if(!level.equals("null") && !event.equals("null")) {
            return errorRepository.findByLevelContainingIgnoreCaseAndEventContainingIgnoreCase(level, event);
        }else if(!environment.equals("null")) {
            return errorRepository.findByEnvironmentContainingIgnoreCase(environment);
        }else if (!event.equals("null")){
            return errorRepository.findByEventContainingIgnoreCase(event);
        }else{
            return errorRepository.findByLevelContainingIgnoreCase(level);
        }
    }

    public List<Error> listErrorDescription(String description){
        return errorRepository.findByDetailsLogContainingIgnoreCase(description);
    }
}
