package com.microorder.OrderProcessor.listiner.dto;

public record CustomerDto(Long id,
                          String name,
                          String email,
                          String phoneNumber) {
}
