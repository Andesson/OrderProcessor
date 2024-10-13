package com.microorder.OrderProcessor.service.imp;

import com.microorder.OrderProcessor.entity.Customer;
import com.microorder.OrderProcessor.repository.ICustomerRepository;
import com.microorder.OrderProcessor.service.ICustomerService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImp implements ICustomerService {
    private final ICustomerRepository customerRepository;

    public CustomerServiceImp(ICustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer upsertCustomer(Customer customer) {
        Optional<Customer> existCustomer = customerRepository.findByEmail(customer.getEmail());
        return existCustomer.map(e -> {
            e.setName(customer.getName());
            e.setPhoneNumber(customer.getPhoneNumber());
            return customerRepository.save(e);
        }).orElseGet(()-> customerRepository.save(customer));
    }
}
