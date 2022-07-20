package com.backenddevelopment.webapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import com.backenddevelopment.webapplication.DAO.employeeDAO;
import com.backenddevelopment.webapplication.entities.employee;
import org.springframework.web.bind.annotation.PathVariable;

import com.backenddevelopment.webapplication.service.employeeServiceImpl;

@RestController
public class employeeController {
	@Autowired
	employeeServiceImpl service;
	//GET all employees
	@GetMapping(value="/api/employees")
	public List<employee> getEmployees(){
		return service.getEmployees();
	}
	//GET Single Employee(R-CRUD) Tested API Status :working
	@RequestMapping(value="/api/employees/{id}",method=RequestMethod.GET)
	public ResponseEntity<employee> getEmployee(@PathVariable("id") int employeeID){
		employee getemployee=service.getEmployee(employeeID);
		return new ResponseEntity<employee>(getemployee,HttpStatus.OK);
		
	}
	//CREATE Single Employee(C-CRUD) Tested API Status :working
	@RequestMapping(value="/api/employees",method=RequestMethod.POST)
	public ResponseEntity<employee> createEmployee(@RequestBody employee employee) {
		employee createemployee=service.createEmployee(employee);
		return new ResponseEntity<employee>(createemployee,HttpStatus.CREATED);
	}
	
	
	//Update Single Employee(U-CRUD) Tested API Status :working
	@PutMapping(value="/api/employees/{id}")
	public ResponseEntity<employee> updateEmployee(@PathVariable("id") int employeeID,@RequestBody employee employee) {
	   employee updatedemployee = service.updateEmployee(employeeID, employee);
	   return new ResponseEntity<employee>(updatedemployee,HttpStatus.OK);
	}
	
	//Delete Single Employee(D-CRUD) Tested API Status :working
	@RequestMapping(value="api/employees/{id}",method=RequestMethod.DELETE)
	public ResponseEntity<employee> deleteEmployee(@PathVariable("id")int employeeID) {
		employee deletedEmployee = service.deleteEmployee(employeeID);
		return new ResponseEntity<employee>(deletedEmployee,HttpStatus.OK);
	}
}
