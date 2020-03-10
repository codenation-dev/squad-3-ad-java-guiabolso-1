package com.errorscentral.guiabolso.repository;

import com.errorscentral.guiabolso.entity.Error;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ErrorRepository extends JpaRepository <Error, Long> {
}
