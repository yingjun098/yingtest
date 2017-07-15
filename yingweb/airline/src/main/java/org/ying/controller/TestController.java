package org.ying.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.ying.model.Airline;
import org.ying.service.AirlineService;

@RestController
public class TestController {
	
	@Resource
	AirlineService airlineService;
	
	@RequestMapping("")
	public Map<String, String> fristController(){
		Random random = new Random(100);
		Airline airline = new Airline();
		airline.setDestinationid(random.nextInt());
		airline.setOriginid(random.nextInt());
		airlineService.inserairline(airline);
		Map<String,String> result = new HashMap<>();
		result.put("frist", "hello");
		return result;
	}

}
