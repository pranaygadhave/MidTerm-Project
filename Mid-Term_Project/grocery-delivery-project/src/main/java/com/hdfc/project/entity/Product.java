package com.hdfc.project.entity;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Products")
public class Product {
		  @Id
		  private long productId;
		  private String productName;
		  private String productDescription;
		  private double productPrice;
		  private String productBrand;
		  private String productCategory;
		  private boolean stock;
		  private String productImageName;
		  private boolean live;

		public Product() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Product(long productId, String productName, String productDescription, double productPrice,
				String productBrand, String productCategory, boolean stock, String productImageName, boolean live) {
			super();
			this.productId = productId;
			this.productName = productName;
			this.productDescription = productDescription;
			this.productPrice = productPrice;
			this.productBrand = productBrand;
			this.productCategory = productCategory;
			this.stock = stock;
			this.productImageName = productImageName;
			this.live = live;
		}

		public long getProductId() {
			return productId;
		}

		public void setProductId(long productId) {
			this.productId = productId;
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

		public boolean isLive() {
			return live;
		}

		public void setLive(boolean live) {
			this.live = live;
		}

		@Override
		public String toString() {
			return "Product [productId=" + productId + ", productName=" + productName + ", productDescription="
					+ productDescription + ", productPrice=" + productPrice + ", productBrand=" + productBrand
					+ ", productCategory=" + productCategory + ", stock=" + stock + ", productImageName="
					+ productImageName + ", live=" + live + "]";
		}
		  
		  
		  
		  
		  
		  
		  
		  
		 
		}


