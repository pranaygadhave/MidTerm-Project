package com.hdfc.project.entity;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection="CartItem")
public class CartItem {
	@Id
	private long cartItemId;
	private int quantity;
	private double totalPrice;
	private Cart cart;
	private Product product;

	public CartItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CartItem(long cartItemId, int quantity, double totalPrice, com.hdfc.project.entity.Cart cart,
			com.hdfc.project.entity.Product product) {
		super();
		this.cartItemId = cartItemId;
		this.quantity = quantity;
		this.totalPrice = totalPrice;
		this.cart = cart;
		this.product = product;
	}

	public long getCartItemId() {
		return cartItemId;
	}

	public void setCartItemId(long cartItemId) {
		this.cartItemId = cartItemId;
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

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "CartItem [cartItemId=" + cartItemId + ", quantity=" + quantity + ", totalPrice=" + totalPrice
				+ ", cart=" + cart + ", product=" + product + "]";
	}
	
	
	
}



