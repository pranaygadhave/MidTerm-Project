package com.hdfc.project.dto;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;



public class CustomerOrderDTO {
	 private Long orderId;
	    private CustomerDTO customer;
	    private Set<OrderItemDTO> items = new HashSet<>();
	    private double billAmount;  
	    private LocalDateTime orderDate;
	    private String OrderStatus;
	    private String trackingId;
	    private LocalDateTime expectedDelivery;
	    private String deliveryAddress;
		public CustomerOrderDTO() {
			super();
			// TODO Auto-generated constructor stub
		}
		public CustomerOrderDTO(Long orderId, CustomerDTO customer, Set<OrderItemDTO> items,
				double billAmount, LocalDateTime orderDate, String orderStatus, String trackingId,
				LocalDateTime expectedDelivery, String deliveryAddress) {
			super();
			this.orderId = orderId;
			this.customer = customer;
			this.items = items;
			this.billAmount = billAmount;
			this.orderDate = orderDate;
			OrderStatus = orderStatus;
			this.trackingId = trackingId;
			this.expectedDelivery = expectedDelivery;
			this.deliveryAddress = deliveryAddress;
		}
		public Long getOrderId() {
			return orderId;
		}
		public void setOrderId(Long orderId) {
			this.orderId = orderId;
		}
		public CustomerDTO getCustomer() {
			return customer;
		}
		public void setCustomer(CustomerDTO customer) {
			this.customer = customer;
		}
		public Set<OrderItemDTO> getItems() {
			return items;
		}
		public void setItems(Set<OrderItemDTO> items) {
			this.items = items;
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
			return OrderStatus;
		}
		public void setOrderStatus(String orderStatus) {
			OrderStatus = orderStatus;
		}
		public String getTrackingId() {
			return trackingId;
		}
		public void setTrackingId(String trackingId) {
			this.trackingId = trackingId;
		}
		public LocalDateTime getExpectedDelivery() {
			return expectedDelivery;
		}
		public void setExpectedDelivery(LocalDateTime expectedDelivery) {
			this.expectedDelivery = expectedDelivery;
		}
		public String getDeliveryAddress() {
			return deliveryAddress;
		}
		public void setDeliveryAddress(String deliveryAddress) {
			this.deliveryAddress = deliveryAddress;
		}
		@Override
		public String toString() {
			return "CustomerOrderDTO [orderId=" + orderId + ", customer=" + customer + ", items=" + items
					+ ", billAmount=" + billAmount + ", orderDate=" + orderDate + ", OrderStatus=" + OrderStatus
					+ ", trackingId=" + trackingId + ", expectedDelivery=" + expectedDelivery + ", deliveryAddress="
					+ deliveryAddress + "]";
		}

	    
	    

}
