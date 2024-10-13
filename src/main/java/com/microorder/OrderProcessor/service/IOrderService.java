package com.microorder.OrderProcessor.service;

import com.microorder.OrderProcessor.listiner.dto.OrderCreatedEvent;

public interface IOrderService {
    void saveOrder(OrderCreatedEvent event);
}
