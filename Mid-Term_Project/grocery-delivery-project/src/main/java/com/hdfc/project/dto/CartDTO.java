package com.hdfc.project.dto;

import java.util.HashSet;
import java.util.Set;



public class CartDTO {
	private long cartId;
	private Set<CartItemDTO> items=new HashSet<>();
	private CustomerDTO customer;
	private double billAmount;
	public CartDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CartDTO(long cartId, Set<CartItemDTO> items, CustomerDTO customer, double billAmount) {
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
	public Set<CartItemDTO> getItems() {
		return items;
	}
	public void setItems(Set<CartItemDTO> items) {
		this.items = items;
	}
	public CustomerDTO getCustomer() {
		return customer;
	}
	public void setCustomer(CustomerDTO customer) {
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
		return "CartDTO [cartId=" + cartId + ", items=" + items + ", customer=" + customer + ", billAmount="
				+ billAmount + "]";
	}
	
	
	
	

}
