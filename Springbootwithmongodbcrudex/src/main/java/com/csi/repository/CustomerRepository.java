package com.csi.repository;

import com.csi.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, Integer> {

    Customer findByCustEmailAndCustPassword(String custEmail, String custPassword);
}
