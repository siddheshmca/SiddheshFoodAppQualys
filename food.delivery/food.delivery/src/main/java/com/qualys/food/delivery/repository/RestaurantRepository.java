package com.qualys.food.delivery.repository;

import com.qualys.food.delivery.entity.Restaurant;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO Restaurant (RESTAURANT_ID,RESTAURANT_NAME, RESTAURANT_LOCATION, RESTAURANT_ADDRESS) VALUES (:id,:name, :location, :cuisine)", nativeQuery = true)
    Restaurant insertRestaurantNative(@Param("id") int id, @Param("name") String name, @Param("location") String location, @Param("cuisine") String cuisine);

}
