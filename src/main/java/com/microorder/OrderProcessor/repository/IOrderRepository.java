package com.microorder.OrderProcessor.repository;

import com.microorder.OrderProcessor.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderRepository extends JpaRepository<OrderEntity, Long> {
}
