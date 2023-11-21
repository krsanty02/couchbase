package com.couchbase.repo;

import com.couchbase.model.Customer;


import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends CouchbaseRepository<Customer, Integer> {
}
