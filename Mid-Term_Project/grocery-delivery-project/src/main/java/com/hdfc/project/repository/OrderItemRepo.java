package com.hdfc.project.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.hdfc.project.entity.OrderItem;

@Repository
public interface OrderItemRepo extends MongoRepository<OrderItem, Long> {

}
