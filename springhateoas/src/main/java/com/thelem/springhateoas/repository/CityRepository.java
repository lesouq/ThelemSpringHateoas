package com.thelem.springhateoas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.thelem.springhateoas.entity.City;

@RepositoryRestResource(path = "metropolises")
public interface CityRepository extends JpaRepository<City, Long> {

}
