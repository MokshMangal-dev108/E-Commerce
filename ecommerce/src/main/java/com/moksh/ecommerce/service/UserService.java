package com.moksh.ecommerce.service;

import com.moksh.ecommerce.exception.UserException;
import com.moksh.ecommerce.model.User;


public interface UserService {

	public User findUserById(Long userId) throws UserException;
	
	public User findUserProfileByJwt(String jwt) throws UserException;
	
}
