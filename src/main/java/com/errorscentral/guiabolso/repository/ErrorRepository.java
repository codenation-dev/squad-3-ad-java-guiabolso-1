package com.errorscentral.guiabolso.repository;

import com.errorscentral.guiabolso.entity.Error;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ErrorRepository extends JpaRepository <Error, Long> {

    Optional<Error> findById(Long id);

    List<Error> findByFiled(Boolean filed);

    List<Error> findByLevelContainingIgnoreCaseAndEventContainingIgnoreCaseAndEnvironmentContainingIgnoreCase(String level, String event, String environment);

    List<Error> findByLevelContainingIgnoreCase(String level);

    List<Error> findByEventContainingIgnoreCase(String event);

    List<Error> findByEnvironmentContainingIgnoreCase(String enrivonment);

    List<Error> findByDetailsLogContainingIgnoreCase(String description);

    List<Error> findByLevelContainingIgnoreCaseAndEventContainingIgnoreCase(String level, String event);

    List<Error> findByLevelContainingIgnoreCaseAndEnvironmentContainingIgnoreCase(String level, String environment);

    List<Error> findByEventContainingIgnoreCaseAndEnvironmentContainingIgnoreCase(String event, String environment);







    

}
