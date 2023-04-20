package com.hdfc.project.entity;

public class ItemRequest {
	
	private long productId;
	private int quantity;
	public ItemRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ItemRequest(long productId, int quantity) {
		super();
		this.productId = productId;
		this.quantity = quantity;
	}
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "ItemRequest [productId=" + productId + ", quantity=" + quantity + "]";
	}
	

}
