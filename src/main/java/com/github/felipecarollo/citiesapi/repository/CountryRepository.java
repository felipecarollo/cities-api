package com.github.felipecarollo.citiesapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.felipecarollo.citiesapi.model.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
