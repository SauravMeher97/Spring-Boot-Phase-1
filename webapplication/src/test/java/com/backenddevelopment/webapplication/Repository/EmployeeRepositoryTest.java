package com.backenddevelopment.webapplication.Repository;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

import org.junit.jupiter.api.ClassOrderer.OrderAnnotation;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.backenddevelopment.webapplication.entities.employee;
@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class EmployeeRepositoryTest {
	@Autowired
	EmployeeRepository repository;

	@Test
	@Order(1)
	void testSaveEmployee() {
		employee emp = new employee("SauravMeher","SauravMeher@Wipro.com");
		repository.save(emp);
		employee emp2 = new employee("Meher","Meher@Wipro.com");
		repository.save(emp2);
		employee emp3 = new employee("Aruna","Aruna@Wipro.com");
		repository.save(emp3);
	
	}
	
	@Test
	@Order(2)
	void testGetEmployeeByID() {
		Optional<employee> employees = repository.findById(1);
		employee employee = employees.get();
		System.out.println(employee);
		
	}
	
	@Test
	@Order(3)
	void testGetEmployees() {
		Iterable<employee> employees = repository.findAll();
		for(employee iteremployee:employees) {
			System.out.println(iteremployee);
		}
		
	}
	
	@Test
	@Order(4)
	void testDeleteEmployee() {
//		Iterable<employee> employees = repository.findAll();
//		for(employee iteremployee:employees) {
//			System.out.println(iteremployee);
//		}
		repository.deleteById(3);
	}

}
