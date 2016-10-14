package com.mavon.springcloud.compute.consumer.client;

import org.springframework.web.bind.annotation.RequestParam;

public class ComputeClientHystrix implements ComputeFeignClient {
	@Override
	public Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
		return -9999;
	}
}
