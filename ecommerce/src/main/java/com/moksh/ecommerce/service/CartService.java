package com.moksh.ecommerce.service;

import com.moksh.ecommerce.exception.ProductException;
import com.moksh.ecommerce.model.Cart;
import com.moksh.ecommerce.model.User;
import com.moksh.ecommerce.request.AddItemRequest;

public interface CartService {

	public Cart createCart(User user);
	
	public String addCartItem(Long userId,AddItemRequest req) throws ProductException;
	
	public Cart findUserCart(Long userId);
	
}
