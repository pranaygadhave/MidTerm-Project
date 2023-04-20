package com.hdfc.project.dto;

import java.util.ArrayList;
import java.util.List;



public class CustomerDTO {
	
	private long customerId;
 	private String customerName;
 	private String customerEmail;
 	private String customerPhone;
 	private String customerPassword;
 	private String customerAddress;
    private List<CustomerOrderDTO> orders = new ArrayList<>();
 	private boolean active;
	public CustomerDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomerDTO(long customerId, String customerName, String customerEmail, String customerPhone,
			String customerPassword, String customerAddress, List<CustomerOrderDTO> orders, boolean active) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.customerPhone = customerPhone;
		this.customerPassword = customerPassword;
		this.customerAddress = customerAddress;
		this.orders = orders;
		this.active = active;
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
	public List<CustomerOrderDTO> getOrders() {
		return orders;
	}
	public void setOrders(List<CustomerOrderDTO> orders) {
		this.orders = orders;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	@Override
	public String toString() {
		return "CustomerDTO [customerId=" + customerId + ", customerName=" + customerName + ", customerEmail="
				+ customerEmail + ", customerPhone=" + customerPhone + ", customerPassword=" + customerPassword
				+ ", customerAddress=" + customerAddress + ", orders=" + orders + ", active=" + active + "]";
	}
 	
 	

}
