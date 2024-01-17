package com.moksh.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moksh.ecommerce.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
