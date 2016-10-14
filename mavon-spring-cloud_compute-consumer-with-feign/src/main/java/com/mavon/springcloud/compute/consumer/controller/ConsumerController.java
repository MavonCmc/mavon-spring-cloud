package com.mavon.springcloud.compute.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mavon.springcloud.compute.consumer.client.ComputeFeignClient;

@RestController
public class ConsumerController {
	@Autowired
	ComputeFeignClient computeClient;

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public Integer add() {
		return computeClient.add(10, 20);
	}
}
