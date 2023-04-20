package com.hdfc.project.dto;

import com.hdfc.project.entity.CustomerOrder;

public class OrderItemDTO {
	
	 private Long orderItemId;
	    private CustomerOrder order;
	    private ProductDTO product;
	    private int quantity;
	    private double totalPrice;
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
		public ProductDTO getProduct() {
			return product;
		}
		@Override
		public String toString() {
			return "OrderItemDTO [orderItemId=" + orderItemId + ", product=" + product + ", quantity=" + quantity
					+ ", totalPrice=" + totalPrice + "]";
		}
		public void setProduct(ProductDTO product) {
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
		public OrderItemDTO(Long orderItemId,CustomerOrder order,
				com.hdfc.project.dto.ProductDTO product, int quantity, double totalPrice) {
			super();
			this.orderItemId = orderItemId;
			this.order = order;
			this.product = product;
			this.quantity = quantity;
			this.totalPrice = totalPrice;
		}
		public OrderItemDTO() {
			super();
			// TODO Auto-generated constructor stub
		}
		

}
