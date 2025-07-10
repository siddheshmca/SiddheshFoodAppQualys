package com.qualys.food.delivery.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodController {

	@RequestMapping("/hello")
	public String welcomeUser() {
		String message = "Welcome Sid Restaurant";
		return message;
	}

}
