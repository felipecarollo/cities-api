package com.github.felipecarollo.citiesapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.felipecarollo.citiesapi.model.State;

public interface StateRepository extends JpaRepository<State, Long> {

}
