package com.microorder.OrderProcessor.service;

import com.microorder.OrderProcessor.entity.OrderEntity;
import com.microorder.OrderProcessor.entity.OrderItem;

import java.util.List;

public interface IOrderItemService {
    List<OrderItem> saveOrderItems(List<OrderItem> items, OrderEntity order);
}
