package com.tenantmanagement.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.tenantmanagement")
public class TenantManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(TenantManagementApplication.class, args);
	}

}
