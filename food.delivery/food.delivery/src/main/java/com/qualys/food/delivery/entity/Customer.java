package com.qualys.food.delivery.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Customer {

	@Id
	private int customer_id;
	@Column
	private String customer_name;
	@Column
	private String customer_address;
	
}
