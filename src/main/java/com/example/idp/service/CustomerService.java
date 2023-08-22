package com.example.idp.service;

import com.example.idp.entity.Customer;
import com.example.idp.repository.Customersrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private final Customersrepository customersRepository;

    @Autowired
    public CustomerService(Customersrepository customersRepository) {
        this.customersRepository = customersRepository;
    }

    public List<Customer> getAllCustomers() {
        return customersRepository.findAll();
    }

    public Customer createCustomer(Customer customer) {
        return customersRepository.save(customer);
    }

}
