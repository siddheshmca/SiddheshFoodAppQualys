package com.qualys.food.delivery.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Restaurant")
public class Restaurant {

    @Id
    private int restaurant_id;
    @Column
    private String restaurant_name;
    @Column
    private String restaurant_location;
    @Column
    private String restaurant_address;
    @Column
    private Long restaurant_phoneno;

    public Long getRestaurant_phoneno() {
        return restaurant_phoneno;
    }

    public void setRestaurant_phoneno(Long restaurant_phoneno) {
        this.restaurant_phoneno = restaurant_phoneno;
    }

    public int getRestaurant_id() {
        return restaurant_id;
    }

    public void setRestaurant_id(int restaurant_id) {
        this.restaurant_id = restaurant_id;
    }

    public String getRestaurant_name() {
        return restaurant_name;
    }

    public void setRestaurant_name(String restaurant_name) {
        this.restaurant_name = restaurant_name;
    }

    public String getRestaurant_location() {
        return restaurant_location;
    }

    public void setRestaurant_location(String restaurant_location) {
        this.restaurant_location = restaurant_location;
    }

    public String getRestaurant_address() {
        return restaurant_address;
    }

    public void setRestaurant_address(String restaurant_address) {
        this.restaurant_address = restaurant_address;
    }

    public Restaurant(int restaurant_id, String restaurant_name, String restaurant_location, String restaurant_address) {
        this.restaurant_id = restaurant_id;
        this.restaurant_name = restaurant_name;
        this.restaurant_location = restaurant_location;
        this.restaurant_address = restaurant_address;
    }
}