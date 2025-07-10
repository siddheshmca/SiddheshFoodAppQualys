package com.qualys.food.delivery.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodController {

	
	public String welcomeUser() {
		String message = "Anky";
		return message;
	}
	
	@RequestMapping("/name")
	public String getUserName() {
		String message = "Welcome "+welcomeUser();
		return message;
	}

}
