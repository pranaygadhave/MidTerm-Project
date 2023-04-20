package com.hdfc.project.entity;

import javax.persistence.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="OrderItem")
public class OrderItem {
	
	@Id
    
    private Long orderItemId;
   
    private CustomerOrder order;
    
    private Product product;
    private int quantity;
    private double totalPrice;
	public OrderItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderItem(Long orderItemId, CustomerOrder order, Product product, int quantity, double totalPrice) {
		super();
		this.orderItemId = orderItemId;
		this.order = order;
		this.product = product;
		this.quantity = quantity;
		this.totalPrice = totalPrice;
	}
	public Long getOrderItemId() {
		return orderItemId;
	}
	public void setOrderItemId(Long orderItemId) {
		this.orderItemId = orderItemId;
	}
	public CustomerOrder getOrder() {
		return order;
	}
	public void setOrder(CustomerOrder order) {
		this.order = order;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	@Override
	public String toString() {
		return "OrderItem [orderItemId=" + orderItemId + ", order=" + order + ", product=" + product + ", quantity="
				+ quantity + ", totalPrice=" + totalPrice + "]";
	}
    
    

}
