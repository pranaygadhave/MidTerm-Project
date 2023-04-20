package com.hdfc.project.entity;

import java.util.ArrayList;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection="Customer")
public class Customer {
	
	@Id
	
 	private long customerId;
	
	
 	private String customerName;
	

 	private String customerEmail;
	
 	private String customerPhone;
	
 	private String customerPassword;
	
 	private String customerAddress;
	
   
    private List<CustomerOrder> orders = new ArrayList<>();
	
 	private boolean active;
 	private String role;
 	private Cart cart;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(long customerId, String customerName, String customerEmail, String customerPhone,
			String customerPassword, String customerAddress, List<com.hdfc.project.entity.CustomerOrder> orders,
			boolean active, String role, com.hdfc.project.entity.Cart cart) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.customerPhone = customerPhone;
		this.customerPassword = customerPassword;
		this.customerAddress = customerAddress;
		this.orders = orders;
		this.active = active;
		this.role = role;
		this.cart = cart;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public List<CustomerOrder> getOrders() {
		return orders;
	}

	public void setOrders(List<CustomerOrder> orders) {
		this.orders = orders;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerEmail="
				+ customerEmail + ", customerPhone=" + customerPhone + ", customerPassword=" + customerPassword
				+ ", customerAddress=" + customerAddress + ", orders=" + orders + ", active=" + active + ", role="
				+ role + ", cart=" + cart + "]";
	}
 	
 	
 	


}
