package com.moksh.ecommerce.service;

import java.util.List;

import com.moksh.ecommerce.exception.ProductException;
import com.moksh.ecommerce.model.Review;
import com.moksh.ecommerce.model.User;
import com.moksh.ecommerce.request.ReviewRequest;

public interface ReviewService {

	public Review createReview(ReviewRequest req,User user) throws ProductException;
	
	public List<Review> getAllReview(Long productId);
	
}
