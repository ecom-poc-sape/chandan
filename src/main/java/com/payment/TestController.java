package com.payment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/sample")
@RestController
public class TestController {

	@GetMapping("/aws")
	public String hello() {
		String hello ="Docker Sample.";
		System.out.println(hello);
		return hello;
	}
}
