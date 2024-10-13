package com.microorder.OrderProcessor.listiner.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public record OrderCreatedEvent(Long orderNumber,
                                LocalDateTime createdAt,
                                String status,
                                CustomerDto customer,
                                BigDecimal totalAmount,
                                BigDecimal taxAmount,
                                BigDecimal discountAmount,
                                PaymentDetailsDto paymentMethod,
                                List<OrderItemEvent> items,
                                LocalDateTime lastUpdated,
                                String notes,
                                String trackingCode
) {
}
