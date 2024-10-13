package com.microorder.OrderProcessor.listiner;

import com.microorder.OrderProcessor.listiner.dto.OrderCreatedEvent;
import com.microorder.OrderProcessor.service.IOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import static com.microorder.OrderProcessor.config.RabbitConfig.ORDER_CREATED_QUEUE;

@Component
public class OrderCreatedListener {
    private final Logger logger = LoggerFactory.getLogger(OrderCreatedListener.class);
    private final IOrderService orderService;

    public OrderCreatedListener(IOrderService orderService) {
        this.orderService = orderService;
    }

    @RabbitListener(queues = ORDER_CREATED_QUEUE)
    public void listen(Message<OrderCreatedEvent> message){
        logger.info("MESSAGE CONSUMED: {}", message);
        orderService.saveOrder(message.getPayload());
    }
}
