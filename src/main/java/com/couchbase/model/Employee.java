package com.couchbase.model;

import java.util.concurrent.TimeUnit;

import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.Expiry;

@Document(expiry = 3,expiryUnit = TimeUnit.MINUTES)
public class Employee {
@Id
 private String city;
 private String email;
 
 
 
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

public Employee(String city, String email) {
	super();
	this.city = city;
	this.email = email;
}

public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

@Override
public String toString() {
	return "Employee [city=" + city + ", email=" + email + "]";
}
 
}
