package com.microorder.OrderProcessor.listiner.dto;

import java.math.BigDecimal;

public record OrderItemEvent(Long productId,
                             String productName,
                             int quantity,
                             BigDecimal unitPrice,
                             BigDecimal totalPrice
) {
}
