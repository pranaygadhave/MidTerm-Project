package com.hdfc.project.entity;

import java.util.HashSet;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Cart")
public class Cart {
	@Id
	private long cartId;
	private Set<CartItem> items=new HashSet<>();
	private Customer customer;
	private double billAmount;

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cart(long cartId, Set<com.hdfc.project.entity.CartItem> items, com.hdfc.project.entity.Customer customer,
			double billAmount) {
		super();
		this.cartId = cartId;
		this.items = items;
		this.customer = customer;
		this.billAmount = billAmount;
	}

	public long getCartId() {
		return cartId;
	}

	public void setCartId(long cartId) {
		this.cartId = cartId;
	}

	public Set<CartItem> getItems() {
		return items;
	}

	public void setItems(Set<CartItem> items) {
		this.items = items;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public double getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}

	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", items=" + items + ", customer=" + customer + ", billAmount=" + billAmount
				+ "]";
	}
	
	
	


}
