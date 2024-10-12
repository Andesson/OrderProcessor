package com.microorder.OrderProcessor.entity;

import com.microorder.OrderProcessor.utils.enums.OrderStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@Table(name = "t_orders")
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long number_order;

    private LocalDateTime createdAt;

    @Enumerated(EnumType.STRING) // Garanta que o Enum seja salvo como String
    private OrderStatus status;

    @ManyToOne // Associa um cliente ao pedido
    @JoinColumn(name = "customer_id") // Nome da coluna que referencia o cliente
    private Customer customer;

    @OneToMany(mappedBy = "orderEntity", cascade = CascadeType.ALL) // Aqui referenciamos a propriedade na OrderItem
    private List<OrderItem> items;

    private BigDecimal totalAmount;
    private BigDecimal taxAmount;
    private BigDecimal discountAmount;

    @OneToOne(cascade = CascadeType.ALL) // Associa detalhes de pagamento ao pedido
    @JoinColumn(name = "payment_details_id")
    private PaymentDetails paymentDetails;

    private LocalDateTime lastUpdated;
    private String notes;
    private String trackingCode;
}
