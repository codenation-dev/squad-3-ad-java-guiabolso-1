package com.errorscentral.guiabolso.repository;

import com.errorscentral.guiabolso.entity.Error;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ErrorRepository extends JpaRepository <Error, Long> {

    Optional<Error> findById(Long id);
    

}
