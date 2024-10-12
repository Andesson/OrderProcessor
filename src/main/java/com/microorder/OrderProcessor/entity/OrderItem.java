package com.microorder.OrderProcessor.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
@Table(name = "t_order_item")
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne // Mapeamento do item como ManyToOne para OrderEntity
    @JoinColumn(name = "order_entity_id") // Nome da coluna que referencia OrderEntity
    private OrderEntity orderEntity; // Adicione esta linha

    @ManyToOne // Mapeamento do produto como ManyToOne
    @JoinColumn(name = "product_id") // Nome da coluna que referencia o produto
    private Product product;

    private int quantity;
    private BigDecimal unitPrice;
    private BigDecimal totalPrice;
}
