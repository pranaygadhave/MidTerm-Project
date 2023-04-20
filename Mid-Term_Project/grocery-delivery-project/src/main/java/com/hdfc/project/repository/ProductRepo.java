package com.hdfc.project.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.hdfc.project.entity.Product;
@Repository
public interface ProductRepo extends MongoRepository<Product, Long> {

	public List<Product> findByProductName(String pname);
	public List<Product> findByProductBrand(String bname);
	public List<Product> findByProductCategory(String cname);


}
