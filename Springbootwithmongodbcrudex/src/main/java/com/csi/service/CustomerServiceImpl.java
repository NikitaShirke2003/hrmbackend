package com.csi.service;

import com.csi.model.Customer;
import com.csi.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository   customerRepositoryImpl;

    public Customer save(Customer customer) {
        return customerRepositoryImpl.save(customer);
    }

    public List<Customer> findAll() {
        return customerRepositoryImpl.findAll();
    }
}
