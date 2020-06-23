package com.thelem.springhateoas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thelem.springhateoas.entity.Country;

public interface CountryRepository extends JpaRepository<Country, Long>{

}
