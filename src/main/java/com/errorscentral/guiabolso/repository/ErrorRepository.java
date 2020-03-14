package com.errorscentral.guiabolso.repository;

import com.errorscentral.guiabolso.entity.Error;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ErrorRepository extends JpaRepository <Error, Long> {

    Optional<Error> findById(Long id);
    
    @Query(value = "SELECT id, created_date, details_log, event, filed, level, environment, update_date, user_id FROM errors", nativeQuery = true )
    Page<Error> findAllErrors(Pageable pageable);
}
