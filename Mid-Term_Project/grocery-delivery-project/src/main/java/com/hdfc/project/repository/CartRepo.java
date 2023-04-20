package com.hdfc.project.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.hdfc.project.entity.Cart;
import com.hdfc.project.entity.Customer;

@Repository

public interface CartRepo extends MongoRepository<Cart,Long> {

	public Cart findByCustomer(Customer customer);


}
