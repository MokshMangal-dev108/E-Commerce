package com.moksh.ecommerce.service;

import org.springframework.stereotype.Service;

import com.moksh.ecommerce.model.OrderItem;
import com.moksh.ecommerce.repository.OrderItemRepository;

@Service
public class OrderItemServiceImplementation implements OrderItemService{

	private OrderItemRepository orderItemRepository;
	public OrderItemServiceImplementation(OrderItemRepository orderItemRepository) {
		this.orderItemRepository=orderItemRepository;
	}
	
	@Override
	public OrderItem createOrderItem(OrderItem orderItem) {
		
		return orderItemRepository.save(orderItem);
		
	}

}
