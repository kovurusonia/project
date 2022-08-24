package com;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com")
@EntityScan(basePackages = "com.bean")							// Enable entity class 
@EnableJpaRepositories(basePackages = "com.dao")

public class ShopForHomeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopForHomeApplication.class, args);
		System.err.println("Server running on port number 9090");
	}

}