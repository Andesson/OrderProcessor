package com.microorder.OrderProcessor.entity;

import com.microorder.OrderProcessor.utils.enums.OrderStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Entity
@Data
@Table(name = "t_orders")
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long number_order;
    private LocalDateTime createdAt;
    private OrderStatus status;
    private Customer customer;
    private List<OrderItem> items;
    private BigDecimal totalAmount;
    private BigDecimal taxAmount;
    private BigDecimal discountAmount;
    private PaymentDetails paymentDetails;
    private LocalDateTime lastUpdated;
    private String notes;
    private String trackingCode;
    private Map<String, String> additionalMetadata;
}
