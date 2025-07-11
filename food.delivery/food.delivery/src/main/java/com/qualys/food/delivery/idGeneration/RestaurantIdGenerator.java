package com.qualys.food.delivery.idGeneration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class RestaurantIdGenerator implements IdGenerator {

    Random random = new Random();
    private Integer restaurantId;

    @Bean
    @Override
    public Integer generateId() {
        restaurantId = 100000 + random.nextInt(900000);
        return restaurantId;
    }
}
