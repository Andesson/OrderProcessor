package com.microorder.OrderProcessor.service;

import com.microorder.OrderProcessor.entity.Customer;

public interface ICustomerService {
    Customer upsertCustomer(Customer customer);
}
