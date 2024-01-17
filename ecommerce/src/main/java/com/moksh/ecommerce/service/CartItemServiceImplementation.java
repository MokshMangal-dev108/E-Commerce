package com.moksh.ecommerce.service;

import java.util.Optional;

import org.springframework.stereotype.Service;


import com.moksh.ecommerce.exception.CartItemException;
import com.moksh.ecommerce.exception.UserException;
import com.moksh.ecommerce.model.Cart;
import com.moksh.ecommerce.model.CartItem;
import com.moksh.ecommerce.model.Product;
import com.moksh.ecommerce.model.User;
import com.moksh.ecommerce.repository.CartItemRepository;
import com.moksh.ecommerce.repository.CartRepository;


@Service
public class CartItemServiceImplementation implements CartItemService{
	
	public CartItemRepository cartItemRepository;
	public UserService userService;
	private CartRepository cartRepository;
	

	public CartItemServiceImplementation(CartItemRepository cartItemRepository,
			UserService userService,CartRepository cartRepository){
		this.cartItemRepository=cartItemRepository;
		this.cartRepository=cartRepository;
		this.userService=userService;
	}
	
	@Override
	public CartItem createCartItem(CartItem cartItem) {
		cartItem.setQuantity(1);
		cartItem.setPrice(cartItem.getProduct().getPrice()*cartItem.getQuantity());
		cartItem.setDiscountedPrice(cartItem.getProduct().
				getDiscountedPrice()*cartItem.getQuantity());
		
		CartItem createdCartItem = cartItemRepository.save(cartItem);
		return createdCartItem;
	}

	@Override
	public CartItem updateCartItem(Long userId, Long id, CartItem cartItem) throws UserException, CartItemException {
		
		CartItem item = findCartItemById(id);
		User user = userService.findUserById(userId);
		
		if(user.getId().equals(userId)) {
			item.setQuantity(cartItem.getQuantity());
			item.setPrice(item.getProduct().getPrice()*item.getQuantity());
			item.setDiscountedPrice(item.getProduct().
					getDiscountedPrice()*item.getQuantity());
		}
		return cartItemRepository.save(item);
	}

	@Override
	public CartItem isCartItemExist(Cart cart, Product product, String size, Long userId) {
		
		CartItem cartItem = cartItemRepository.isCartItemExist
				(cart, product, size, userId);
		
		return cartItem;
		
	}

	@Override
	public void removeCartItem(Long userId, Long cartItemId) throws UserException, 
					CartItemException {
		
		System.out.println("userId- "+userId+" cartItemId "+cartItemId);
		
		CartItem cartItem=findCartItemById(cartItemId);
		
		User user=userService.findUserById(cartItem.getUserId());
		User reqUser=userService.findUserById(userId);
		
		if(user.getId().equals(reqUser.getId())) {
			cartItemRepository.deleteById(cartItem.getId());
		}
		else {
			throw new UserException("you can't remove anothor users item");
		}
		
	}

	@Override
	public CartItem findCartItemById(Long cartItemId) throws CartItemException {
		
		Optional<CartItem> opt=cartItemRepository.findById(cartItemId);
		
		if(opt.isPresent()) {
			return opt.get();
		}
		throw new CartItemException("cartItem not found with id : "+cartItemId);
		
	}

}
