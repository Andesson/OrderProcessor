package com.microorder.OrderProcessor.dto;

import java.math.BigDecimal;

public class OrderItemDto {
    private Long id;
    private ProductDto product;
    private int quantity;
    private BigDecimal unitPrice;
    private BigDecimal totalPrice;
}
