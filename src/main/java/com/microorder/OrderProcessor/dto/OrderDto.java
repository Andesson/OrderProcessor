package com.microorder.OrderProcessor.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class OrderDto {
    private Long numberOrder;
    private LocalDateTime createdAt;
    private String status; // Usa String para representar o enum
    private CustomerDto customer;
    private List<OrderItemDto> items;
    private BigDecimal totalAmount;
    private BigDecimal taxAmount;
    private BigDecimal discountAmount;
    private PaymentDetailsDto paymentDetails;
    private LocalDateTime lastUpdated;
    private String notes;
    private String trackingCode;
}
