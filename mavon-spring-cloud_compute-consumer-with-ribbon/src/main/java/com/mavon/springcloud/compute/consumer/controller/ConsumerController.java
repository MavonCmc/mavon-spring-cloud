package com.mavon.springcloud.compute.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.mavon.springcloud.compute.consumer.service.ComputeService;

@RestController
public class ConsumerController {
	@Autowired
	RestTemplate restTemplate;

	@Autowired
	private ComputeService computeService;

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String add() {
		return restTemplate.getForEntity("http://COMPUTE-SERVICE/add?a=10&b=20", String.class).getBody();
	}

	@RequestMapping(value = "/add1", method = RequestMethod.GET)
	public String add1() {
		return computeService.addService();
	}

}
