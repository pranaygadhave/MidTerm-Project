package com.hdfc.project.dto;



public class CartItemDTO {
	
	 private String productName;	
	  private String productDescription;
	  private double productPrice;
	  private String productBrand;
	  private String productCategory;
	  private boolean live;
	  private boolean stock;
	  private String productImageName;
	public CartItemDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CartItemDTO(String productName, String productDescription, double productPrice, String productBrand,
			String productCategory, boolean live, boolean stock, String productImageName) {
		super();
		this.productName = productName;
		this.productDescription = productDescription;
		this.productPrice = productPrice;
		this.productBrand = productBrand;
		this.productCategory = productCategory;
		this.live = live;
		this.stock = stock;
		this.productImageName = productImageName;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductBrand() {
		return productBrand;
	}
	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public boolean isLive() {
		return live;
	}
	public void setLive(boolean live) {
		this.live = live;
	}
	public boolean isStock() {
		return stock;
	}
	public void setStock(boolean stock) {
		this.stock = stock;
	}
	public String getProductImageName() {
		return productImageName;
	}
	public void setProductImageName(String productImageName) {
		this.productImageName = productImageName;
	}
	@Override
	public String toString() {
		return "CartItemDTO [productName=" + productName + ", productDescription=" + productDescription
				+ ", productPrice=" + productPrice + ", productBrand=" + productBrand + ", productCategory="
				+ productCategory + ", live=" + live + ", stock=" + stock + ", productImageName=" + productImageName
				+ "]";
	
	  
	}
	  
	  

}
