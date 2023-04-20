package com.hdfc.project.entity;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;





@Document(collection="CustomerOrder")
public class CustomerOrder {
		
		@Id
	    private Long orderId;

	    private Customer customer;
	    private Set<OrderItem> orderItems = new HashSet<>();
	    
	    private double billAmount;
	    
	    private LocalDateTime orderDate;
	    
	    private String orderStatus;
	    
	    
	    private String trackingId;
	    
	    private String deliveryAddress;
	    
	    private LocalDateTime expectedDelivery;

		public CustomerOrder() {
			super();
			// TODO Auto-generated constructor stub
		}

		public CustomerOrder(Long orderId, Customer customer, Set<OrderItem> orderItems, double billAmount,
				LocalDateTime orderDate, String orderStatus, String trackingId, String deliveryAddress,
				LocalDateTime expectedDelivery) {
			super();
			this.orderId = orderId;
			this.customer = customer;
			this.orderItems = orderItems;
			this.billAmount = billAmount;
			this.orderDate = orderDate;
			this.orderStatus = orderStatus;
			this.trackingId = trackingId;
			this.deliveryAddress = deliveryAddress;
			this.expectedDelivery = expectedDelivery;
		}

		public Long getOrderId() {
			return orderId;
		}

		public void setOrderId(Long orderId) {
			this.orderId = orderId;
		}

		public Customer getCustomer() {
			return customer;
		}

		public void setCustomer(Customer customer) {
			this.customer = customer;
		}

		public Set<OrderItem> getOrderItems() {
			return orderItems;
		}

		public void setOrderItems(Set<OrderItem> orderItems) {
			this.orderItems = orderItems;
		}

		public double getBillAmount() {
			return billAmount;
		}

		public void setBillAmount(double billAmount) {
			this.billAmount = billAmount;
		}

		public LocalDateTime getOrderDate() {
			return orderDate;
		}

		public void setOrderDate(LocalDateTime orderDate) {
			this.orderDate = orderDate;
		}

		public String getOrderStatus() {
			return orderStatus;
		}

		public void setOrderStatus(String orderStatus) {
			this.orderStatus = orderStatus;
		}

		public String getTrackingId() {
			return trackingId;
		}

		public void setTrackingId(String trackingId) {
			this.trackingId = trackingId;
		}

		public String getDeliveryAddress() {
			return deliveryAddress;
		}

		public void setDeliveryAddress(String deliveryAddress) {
			this.deliveryAddress = deliveryAddress;
		}

		public LocalDateTime getExpectedDelivery() {
			return expectedDelivery;
		}

		public void setExpectedDelivery(LocalDateTime expectedDelivery) {
			this.expectedDelivery = expectedDelivery;
		}

		@Override
		public String toString() {
			return "CustomerOrder [orderId=" + orderId + ", customer=" + customer + ", billAmount=" + billAmount
					+ ", orderDate=" + orderDate + ", orderStatus=" + orderStatus + ", trackingId=" + trackingId
					+ ", deliveryAddress=" + deliveryAddress + ", expectedDelivery=" + expectedDelivery + "]";
		}
		
	    
	    
	    

}
