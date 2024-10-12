package com.microorder.OrderProcessor.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "t_customer")
public class Customer {
    private Long id;
    private String name;
    private String email;
    private String phoneNumber;
}
