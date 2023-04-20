package com.hdfc.project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hdfc.project.dto.ProductDTO;
import com.hdfc.project.entity.Product;
import com.hdfc.project.exception.ProductNotFound;

public interface IProductService {
	
	public ProductDTO insertProduct(ProductDTO p);
	public ProductDTO updateProduct(ProductDTO p);
	public ProductDTO getById(long id) throws ProductNotFound  ;
	public String deleteProduct(long id) throws ProductNotFound ;
	public List<ProductDTO> findByProductName(String pname) throws ProductNotFound ;
	public List<ProductDTO> findByProductBrand(String bname) throws ProductNotFound ;
	public List<ProductDTO> findByProductCategory(String cname) throws ProductNotFound ;
	public List<ProductDTO> findAll() throws ProductNotFound ;
	public Product toEntity(ProductDTO p);
	public ProductDTO toDTO(Product product);

}
