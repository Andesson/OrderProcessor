package com.microorder.OrderProcessor.entity;

import jakarta.persistence.Table;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Table(name = "t_Payment")
public class PaymentDetails {
    private String paymentMethod;
    private BigDecimal amountPaid;
    private LocalDateTime paymentDate;
}
