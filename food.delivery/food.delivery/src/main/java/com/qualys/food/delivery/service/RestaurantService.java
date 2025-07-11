package com.qualys.food.delivery.service;

import com.qualys.food.delivery.entity.Restaurant;
import com.qualys.food.delivery.repository.RestaurantRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {
    @Autowired
    private RestaurantRepository restaurantRepository;

    @Transactional
    public Restaurant createRestaurant(Restaurant restaurant) {
        return restaurantRepository.insertRestaurantNative(restaurant.getRestaurant_id(),restaurant.getRestaurant_name(),restaurant.getRestaurant_location(),restaurant.getRestaurant_address());
    }

    public List<Restaurant> getAllRestaurants() {
        return restaurantRepository.findAll();
    }
}
