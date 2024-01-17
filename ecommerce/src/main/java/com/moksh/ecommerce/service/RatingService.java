package com.moksh.ecommerce.service;

import java.util.List;

import com.moksh.ecommerce.exception.ProductException;
import com.moksh.ecommerce.model.Rating;
import com.moksh.ecommerce.model.User;
import com.moksh.ecommerce.request.RatingRequest;

public interface RatingService {

	public Rating createRating(RatingRequest req,User user) throws ProductException;
	
	public List<Rating> getProductsRating(Long productId);
	
}
