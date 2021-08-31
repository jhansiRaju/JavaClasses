package com.bhn.xsd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EntityScan("com.bhn.model")
@SpringBootApplication
@ComponentScan("com.bhn")
@EnableMongoRepositories("com.bhn.repository")
public class BHNApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final ObjectFactory fact=new ObjectFactory();
		final Address address=new Address();
		address.setFirstname("ABCD");
		SpringApplication.run(BHNApplication.class, args);
		//System.out.println("First Name : "+address.firstname);
	}

}
