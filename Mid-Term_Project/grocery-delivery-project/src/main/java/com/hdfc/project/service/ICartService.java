package com.hdfc.project.service;

import org.springframework.stereotype.Service;

import com.hdfc.project.dto.CartDTO;
import com.hdfc.project.entity.ItemRequest;
import com.hdfc.project.exception.CartIsEmpty;
import com.hdfc.project.exception.CustomerNotFound;
import com.hdfc.project.exception.ItemNotFound;
import com.hdfc.project.exception.OpenApiResourceNotFoundException;
import com.hdfc.project.exception.ProductNotFound;



public interface ICartService {
	public CartDTO addItem(ItemRequest item,String email) throws CustomerNotFound, ProductNotFound, OpenApiResourceNotFoundException ;
	public CartDTO removeItem(long productId, String email) throws ProductNotFound, ItemNotFound ;
	public CartDTO viewCart(String email) throws CustomerNotFound, CartIsEmpty ;
}
