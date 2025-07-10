package com.qualys.food.delivery.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Order {

	@Id
	private int order_id;
	@Column
	private int customer_id;
	@Column
	private int restaurant_id;
	@Column
	private String customer_name;
	@Column
	private String restaurant_name;
	@Column
	private double order_price;
	
}