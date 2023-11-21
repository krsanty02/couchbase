package com.couchbase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;

@SpringBootApplication
public class CouchbaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(CouchbaseApplication.class, args);
	}

}
