package com.thelem.springhateoas.repository;

import com.thelem.springhateoas.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {}
