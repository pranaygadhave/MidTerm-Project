package com.hdfc.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hdfc.project.dto.CartDTO;
import com.hdfc.project.entity.ItemRequest;
import com.hdfc.project.exception.CartIsEmpty;
import com.hdfc.project.exception.CustomerNotFound;
import com.hdfc.project.exception.ItemNotFound;
import com.hdfc.project.exception.OpenApiResourceNotFoundException;
import com.hdfc.project.exception.ProductNotFound;
import com.hdfc.project.service.ICartService;


@RestController
@RequestMapping("/Cart")
public class CartController {

	@Autowired
	private ICartService service;;
	
	@PostMapping("/user/add/{email}")
	public ResponseEntity<CartDTO> addtoCart(@RequestBody ItemRequest itemRequest,@PathVariable String email) throws CustomerNotFound, ProductNotFound, OpenApiResourceNotFoundException{
		
		CartDTO addItem=this.service.addItem(itemRequest,email);
		return new ResponseEntity<CartDTO>(addItem,HttpStatus.OK);
	}
	
	@PostMapping("/user/remove/{productId}/{email}")
     public ResponseEntity<CartDTO> removeFromCart(@PathVariable long productId,@PathVariable String email) throws ProductNotFound, ItemNotFound{
		
		CartDTO addItem=this.service.removeItem(productId,email);
		return new ResponseEntity<CartDTO>(addItem,HttpStatus.OK);
	}
	@GetMapping("/user/view/{email}")
    public ResponseEntity<CartDTO> viewCart(@PathVariable String email) throws  CustomerNotFound, CartIsEmpty{
		
		CartDTO addItem=this.service.viewCart(email);
		return new ResponseEntity<CartDTO>(addItem,HttpStatus.OK);
	}


}
