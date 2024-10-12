package com.microorder.OrderProcessor.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "t_payment")
public class PaymentDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // ID como Long em vez de String

    private String paymentMethod; // Alterar o tipo para String
    private BigDecimal amountPaid;
    private LocalDateTime paymentDate;
}
