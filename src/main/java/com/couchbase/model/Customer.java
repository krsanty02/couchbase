package com.couchbase.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.Expiry;
import org.springframework.data.couchbase.core.mapping.Field;
@Document
public class Customer {
    @Id
    private int id;
    @Field
    private String name;
    @Field(name="mobile")
    private String phone;
  
    private Employee emp;

  

    public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int id, String name, String phone, Employee emp) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.emp = emp;
	}

	public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", phone=" + phone + ", emp=" + emp + "]";
	}

  
}
