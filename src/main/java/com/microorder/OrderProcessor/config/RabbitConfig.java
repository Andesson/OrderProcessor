package com.microorder.OrderProcessor.config;

import org.springframework.amqp.core.*;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RabbitConfig {
    public static final String ORDER_CREATED_QUEUE = "order-created";

    @Bean
    public Jackson2JsonMessageConverter jackson2JsonMessageConverter(){
        return new Jackson2JsonMessageConverter();
    }
    @Bean
    public Declarable orderCreatedQueue(){
        return new org.springframework.amqp.core.Queue(ORDER_CREATED_QUEUE);
    }
    @Bean
    public Queue orderQueue() {
        return new Queue("orderQueue", false);
    }
    @Bean
    public TopicExchange orderExchange() {
        return new TopicExchange("orderExchange");
    }
    @Bean
    public Binding binding(Queue orderQueue, TopicExchange orderExchange) {
        return BindingBuilder.bind(orderQueue).to(orderExchange).with("order.#");
    }
}
