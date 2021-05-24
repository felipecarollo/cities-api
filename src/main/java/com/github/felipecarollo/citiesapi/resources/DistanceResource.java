package com.github.felipecarollo.citiesapi.resources;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.felipecarollo.citiesapi.service.DistanceService;

@RestController
@RequestMapping("/distances")
public class DistanceResource {

	  @Autowired
	  private DistanceService service;
	  
	  Logger log = LoggerFactory.getLogger(DistanceResource.class);



	  @GetMapping("/by-points")
	  public ResponseEntity byPoints(@RequestParam(name = "from") final Long city1,
	                         @RequestParam(name = "to") final Long city2) {
	    log.info("byPoints");
	    return ResponseEntity.ok().body(service.distanceByPointsInMiles(city1, city2));
	  }

	  @GetMapping("/by-cube")
	  public ResponseEntity byCube(@RequestParam(name = "from") final Long city1,
	                       @RequestParam(name = "to") final Long city2) {
	    log.info("byCube");
	    return ResponseEntity.ok().body(service.distanceByCubeInMeters(city1, city2));
	  }


}
