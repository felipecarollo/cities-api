package com.github.felipecarollo.citiesapi.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.felipecarollo.citiesapi.model.City;
import com.github.felipecarollo.citiesapi.repository.CityRepository;

@RestController
@RequestMapping("/cities")
public class CityResource {

	@Autowired
	private CityRepository cityRepository;

	@GetMapping
	public Page<City> cidades(final Pageable page) {
		return cityRepository.findAll(page);
	}
	
	
}
