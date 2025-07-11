package com.qualys.food.delivery.repository;

import com.qualys.food.delivery.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository  extends JpaRepository<Customer, Long> {
}
