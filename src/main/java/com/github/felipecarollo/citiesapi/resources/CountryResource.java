package com.github.felipecarollo.citiesapi.resources;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.felipecarollo.citiesapi.model.Country;
import com.github.felipecarollo.citiesapi.repository.CountryRepository;


@RestController
@RequestMapping("/countries")
public class CountryResource {

	@Autowired
	private CountryRepository countryRepository;
	
	@GetMapping
	public Page<Country> countries (Pageable page) {
		return countryRepository.findAll(page);
	}
	@GetMapping("/{id}")
	public ResponseEntity getOne (@PathVariable Long id) {
		Optional<Country> pais = countryRepository.findById(id);
		if(pais.isPresent()) {
			return ResponseEntity.ok(pais.get());
		} else {
			return ResponseEntity.notFound().build();
		}
	}
}
