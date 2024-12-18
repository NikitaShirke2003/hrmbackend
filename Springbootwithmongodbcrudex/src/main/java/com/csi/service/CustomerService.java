package com.csi.service;

import com.csi.model.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    Customer save(Customer customer);

    List<Customer> findAll();


}
