package com.hdfc.project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hdfc.project.dto.CustomerDTO;
import com.hdfc.project.entity.Customer;
import com.hdfc.project.exception.CustomerNotFound;


public interface ICustomerService {

	public CustomerDTO createCustomer(CustomerDTO c);
	public CustomerDTO updateCustomer(CustomerDTO c);
	public CustomerDTO getById(long id) throws CustomerNotFound ;
	public String deleteById(long id) throws CustomerNotFound ;
	public List<CustomerDTO> findAll() throws CustomerNotFound ;
	public Customer findByCustomerEmail(String email);
	public CustomerDTO toDTO(Customer customer);
	public Customer toEntity(CustomerDTO c);

}
