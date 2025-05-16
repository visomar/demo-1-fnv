package com.example.demo_1_fnv;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourierController {

	@GetMapping("/")
	public String deliverPlatinumChip() {
		return "Sorry, Benny stole it from me";
	}
}
