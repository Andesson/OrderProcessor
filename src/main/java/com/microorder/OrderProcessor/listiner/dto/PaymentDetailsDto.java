package com.microorder.OrderProcessor.listiner.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record PaymentDetailsDto(Long id,
                                String paymentMethod,
                                BigDecimal amountPaid,
                                LocalDateTime paymentDate) {
}
