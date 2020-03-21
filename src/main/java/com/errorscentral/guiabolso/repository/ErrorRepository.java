package com.errorscentral.guiabolso.repository;

import com.errorscentral.guiabolso.entity.Error;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ErrorRepository extends JpaRepository <Error, Long> {

    Optional<Error> findById(Long id);

    List<Error> findByLevelAndEventAndEnvironment(String level, String event, String environment);

    List<Error> findByLevel(String level);

    List<Error> findByEvent(String event);

    List<Error> findByEnvironment(String enrivonment);

    List<Error> findByDetailsLogContainingIgnoreCase(String description);

    List<Error> findByLevelAndEvent(String level, String event);

    List<Error> findByLevelAndEnvironment(String level, String environment);

    List<Error> findByEventAndEnvironment(String event, String environment);//







    

}
