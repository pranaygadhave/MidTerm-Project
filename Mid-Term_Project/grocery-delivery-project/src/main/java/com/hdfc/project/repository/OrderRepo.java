package com.hdfc.project.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.hdfc.project.entity.CustomerOrder;

@Repository
public interface OrderRepo extends MongoRepository<CustomerOrder,Long>{
	
	  public CustomerOrder findByTrackingId(String trackingId);

//	public CustomerOrder getById(long id);


}
