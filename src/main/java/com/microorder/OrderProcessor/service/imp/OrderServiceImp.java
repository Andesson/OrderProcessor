package com.microorder.OrderProcessor.service.imp;

import com.microorder.OrderProcessor.entity.OrderEntity;
import com.microorder.OrderProcessor.listiner.dto.OrderCreatedEvent;
import com.microorder.OrderProcessor.repository.IOrderRepository;
import com.microorder.OrderProcessor.service.ICustomerService;
import com.microorder.OrderProcessor.service.IOrderItemService;
import com.microorder.OrderProcessor.service.IOrderService;
import com.microorder.OrderProcessor.utils.mapper.Mapper;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImp implements IOrderService {

    private final IOrderRepository _OrderRepository;
    private final ICustomerService customerService;
    private final IOrderItemService orderItemService;
    private final Mapper mapper;

    public OrderServiceImp(IOrderRepository orderRepository, ICustomerService customerService, IOrderItemService orderItemService, Mapper mapper) {
        _OrderRepository = orderRepository;
        this.customerService = customerService;
        this.orderItemService = orderItemService;
        this.mapper = mapper;
    }

    @Override
    public void saveOrder(OrderCreatedEvent event) {
        OrderEntity orderEntity = mapper.convert(event, OrderEntity.class);
        orderEntity.setCustomer(customerService.upsertCustomer(orderEntity.getCustomer()));
        _OrderRepository.save(orderEntity);
        orderEntity.setItems(orderItemService.saveOrderItems(orderEntity.getItems(), orderEntity));
        System.out.println(_OrderRepository);
    }
}
