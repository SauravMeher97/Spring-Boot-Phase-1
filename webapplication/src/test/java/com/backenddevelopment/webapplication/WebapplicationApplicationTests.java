package com.backenddevelopment.webapplication;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.backenddevelopment.webapplication.Repository.EmployeeRepository;

@SpringBootTest
class WebapplicationApplicationTests {
	@Autowired
	EmployeeRepository repository;

	@Test
	void contextLoads() {
	}

}
