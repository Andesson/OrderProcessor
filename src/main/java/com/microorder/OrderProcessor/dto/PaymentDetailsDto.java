package com.microorder.OrderProcessor.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class PaymentDetailsDto {
    private Long id;
    private String paymentMethod;
    private BigDecimal amountPaid;
    private LocalDateTime paymentDate;
}
