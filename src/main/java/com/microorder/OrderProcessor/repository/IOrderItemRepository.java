package com.microorder.OrderProcessor.repository;

import com.microorder.OrderProcessor.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderItemRepository extends JpaRepository<OrderItem, Long> {
}
