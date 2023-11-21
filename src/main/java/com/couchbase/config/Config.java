package com.couchbase.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;


@Configuration
@EnableCouchbaseRepositories(basePackages = { "com.couchbase.repo" })
public class Config extends AbstractCouchbaseConfiguration{
	 public static final String NODE_LIST = "localhost";
	    public static final String BUCKET_NAME = "customer";
	    public static final String BUCKET_USERNAME = "Administrator";
	    public static final String BUCKET_PASSWORD = "Administrator";
	@Override
	public String getConnectionString() {
		return NODE_LIST ;
	}

	@Override
	public String getUserName() {
		return BUCKET_USERNAME;
	}

	@Override
	public String getPassword() {
		return BUCKET_PASSWORD;
	}

	@Override
	public String getBucketName() {
		return BUCKET_NAME;
	}

}
