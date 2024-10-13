package com.microorder.OrderProcessor.service.imp;

import com.microorder.OrderProcessor.entity.OrderEntity;
import com.microorder.OrderProcessor.entity.OrderItem;
import com.microorder.OrderProcessor.repository.IOrderItemRepository;
import com.microorder.OrderProcessor.service.IOrderItemService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderItemServiceImp implements IOrderItemService {
    private final IOrderItemRepository _orderItemRepository;

    public OrderItemServiceImp(IOrderItemRepository orderItemRepository) {
        _orderItemRepository = orderItemRepository;
    }

    @Override
    public List<OrderItem> saveOrderItems(List<OrderItem> items, OrderEntity order) {
        return items.stream()
                .map(e -> {
                    e.setOrderEntity(order);
                    return _orderItemRepository.save(e);
                })
                .collect(Collectors.toList());
    }
}
