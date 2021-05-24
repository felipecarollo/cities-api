package com.github.felipecarollo.citiesapi.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.felipecarollo.citiesapi.model.State;
import com.github.felipecarollo.citiesapi.repository.StateRepository;


@RestController
@RequestMapping("/states")
public class StateResource {

	@Autowired
	private StateRepository stateRepository;
	
	@GetMapping
	public List<State> states ( ) {
		return stateRepository.findAll();
	}
	@GetMapping("/{id}")
	public ResponseEntity getOne (@PathVariable Long id) {
		Optional<State> estado = stateRepository.findById(id);
		if(estado.isPresent()) {
			return ResponseEntity.ok(estado.get());
		} else {
			return ResponseEntity.notFound().build();
		}
	}
}
