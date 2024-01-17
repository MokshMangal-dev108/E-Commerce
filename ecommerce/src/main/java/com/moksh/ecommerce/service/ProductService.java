package com.moksh.ecommerce.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.moksh.ecommerce.exception.ProductException;
import com.moksh.ecommerce.model.Product;
import com.moksh.ecommerce.request.CreateProductRequest;

public interface ProductService {
	
	//this methods can be used when we use filters or many more times it can be used;

	public Product createProduct(CreateProductRequest req);
	
	public String deleteProduct(Long ProductId) throws ProductException;
	
	public Product updateProduct(Long ProductId,Product req) throws ProductException;
	
	public Product findProductById(Long id) throws ProductException;
	
	public List<Product> findProductByCategory(String category);
	
	public List<Product> getAllProducts();
	
	public Page<Product> getAllProduct(String category,List<String>colors,
			List<String>sizes,Integer minPrice,Integer maxPrice,Integer minDiscount,
			String sort,String stock,Integer pageNumber,Integer pageSize);
	
	
}
