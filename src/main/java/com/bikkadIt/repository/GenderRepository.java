package com.bikkadIt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bikkadIt.model.Gender;

public interface GenderRepository extends JpaRepository<Gender, Integer>{

}
