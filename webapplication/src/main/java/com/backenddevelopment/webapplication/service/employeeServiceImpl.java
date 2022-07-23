package com.backenddevelopment.webapplication.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backenddevelopment.webapplication.DAO.employeeDAO;
import com.backenddevelopment.webapplication.Repository.EmployeeRepository;
import com.backenddevelopment.webapplication.entities.employee;
import com.backenddevelopment.webapplication.exceptions.NotFoundException;
@Service
public class employeeServiceImpl implements employeeService {
//    @Autowired
//	employeeDAO dao;
    
    @Autowired
    EmployeeRepository repository;
	
    @Override
	public employee createEmployee(employee employee) {
    	employee savedEmployee = repository.save(employee);
		return savedEmployee;
	}

	@Override
	public employee deleteEmployee(int employeeID) {
		Optional<employee>  employees = repository.findById(employeeID);
		employee deletedEmployee = employees.get();
		if(deletedEmployee==null) {
			throw new NotFoundException("The Employee with id "+employeeID+" was not found!");
		}
		repository.deleteById(employeeID);
		return deletedEmployee;
	}

	@Override
	public employee updateEmployee(int employeeID, employee employee) {
		// TODO Auto-generated method stub
		Optional<employee> employees  = repository.findById(employeeID);
		employee updatedEmployee = employees.get();
		if(updatedEmployee==null) {
			throw new NotFoundException("The Employee with id "+employeeID+" was not found!");
		}
		updatedEmployee.setEmployeeEmail(employee.getEmployeeEmail());
		updatedEmployee.setEmployeeName(employee.getEmployeeName());
		updatedEmployee =repository.save(updatedEmployee);
		return updatedEmployee;
	}

	@Override
	public employee getEmployee(int employeeID) {
		// TODO Auto-generated method stub
		Optional<employee> employees = repository.findById(employeeID);
		employee getEmployee = employees.get();
		if(getEmployee==null) {
			throw new NotFoundException("The Employee with id "+employeeID+" was not found!");
		}
		return getEmployee;
	}

	@Override
	public List<employee> getEmployees() {
		// TODO Auto-generated method stub
		List<employee> employees = (List<employee>)repository.findAll();
		return employees;
	}

}
