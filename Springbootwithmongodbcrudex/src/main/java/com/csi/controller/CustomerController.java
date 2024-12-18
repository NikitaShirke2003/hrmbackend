package com.csi.controller;

import com.csi.model.Customer;
import com.csi.service.CustomerService;
import com.csi.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerServiceImpl customerServiceImpl;

    @PostMapping("/save")
    public ResponseEntity<Customer> save(@RequestBody Customer customer) {
        return new ResponseEntity<>(customerServiceImpl.save(customer), HttpStatus.CREATED);
    }

    @GetMapping("/findAll")

    public ResponseEntity<List<Customer>> findAll() {
        return ResponseEntity.ok(customerServiceImpl.findAll());
    }

}
