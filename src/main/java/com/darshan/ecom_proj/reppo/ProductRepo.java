package com.darshan.ecom_proj.reppo;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.darshan.ecom_proj.model.Product;

 

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {

	 
}
