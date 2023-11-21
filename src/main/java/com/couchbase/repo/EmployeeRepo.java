package com.couchbase.repo;

import org.springframework.data.couchbase.repository.CouchbaseRepository;


import com.couchbase.model.Employee;

public interface EmployeeRepo extends CouchbaseRepository<Employee, Integer> { 

}
