package com.qualys.food.delivery.controller;

import com.qualys.food.delivery.entity.Restaurant;
import com.qualys.food.delivery.idGeneration.RestaurantIdGenerator;
import com.qualys.food.delivery.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    @Autowired(required = true)
    private RestaurantIdGenerator restaurantId;

    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
    public ResponseEntity<Restaurant> addRestaurant(@RequestBody Restaurant restaurant) {
        restaurant.setRestaurant_id(restaurantId.generateId());
        restaurantService.createRestaurant(restaurant);
        System.out.println(restaurant);
        return new ResponseEntity<Restaurant>(HttpStatus.CREATED);
    }

    @RequestMapping(value = "/check", method = RequestMethod.GET, produces = "application/json", consumes = "application/json")
    public List<Restaurant> getAllRestaurants() {
        return restaurantService.getAllRestaurants();
    }

}
