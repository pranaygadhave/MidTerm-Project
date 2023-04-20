package com.hdfc.project.service;


import org.springframework.stereotype.Service;

import com.hdfc.project.dto.CustomerOrderDTO;
import com.hdfc.project.exception.CartIsEmpty;
import com.hdfc.project.exception.ChoiceNotValid;
import com.hdfc.project.exception.CustomerNotFound;
import com.hdfc.project.exception.NoOrdersAvailable;
import com.hdfc.project.exception.OrderNotAvailable;


public interface ICustomerOrderService {

	public CustomerOrderDTO placeOrder(String email) throws CustomerNotFound, CartIsEmpty ;
	public String cancelOrder(long id,String email) throws CustomerNotFound, OrderNotAvailable   ;
	public CustomerOrderDTO viewOrder(long id,String email) throws CustomerNotFound, NoOrdersAvailable, OrderNotAvailable, NoOrdersAvailable  ;
	public String setStatusShop(long id,int choice) throws ChoiceNotValid, OrderNotAvailable  ;
	public String setStatusAgent(long id,int choice) throws ChoiceNotValid, OrderNotAvailable ;
	public String getStatus(String trackingId) throws OrderNotAvailable  ;


}
