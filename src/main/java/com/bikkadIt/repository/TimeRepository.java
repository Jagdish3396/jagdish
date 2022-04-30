package com.bikkadIt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bikkadIt.model.Timing;

public interface TimeRepository extends JpaRepository<Timing, Integer>{

}
