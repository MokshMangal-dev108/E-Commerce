package com.moksh.ecommerce.service;

import com.moksh.ecommerce.exception.CartItemException;
import com.moksh.ecommerce.exception.UserException;
import com.moksh.ecommerce.model.Cart;
import com.moksh.ecommerce.model.CartItem;
import com.moksh.ecommerce.model.Product;

public interface CartItemService {

	public CartItem createCartItem(CartItem cartItem);
	
	public CartItem updateCartItem(Long userId,Long id,CartItem cartItem) 
			throws UserException, CartItemException;
	
	public CartItem isCartItemExist(Cart cart,Product product,String size,Long userId);
	
	public void removeCartItem(Long userId,Long cartItemId) 
			throws UserException,CartItemException;
	
	public CartItem findCartItemById(Long cartItemId) throws CartItemException;
	
	
}
