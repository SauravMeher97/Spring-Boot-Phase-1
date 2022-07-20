package com.backenddevelopment.webapplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backenddevelopment.webapplication.DAO.employeeDAO;
import com.backenddevelopment.webapplication.entities.employee;
import com.backenddevelopment.webapplication.exceptions.NotFoundException;
@Service
public class employeeServiceImpl implements employeeService {
    @Autowired
	employeeDAO dao;
	@Override
	public employee createEmployee(employee employee) {
		return dao.createEmployee(employee);
	}

	@Override
	public employee deleteEmployee(int employeeID) {
		employee deletedEmployee = dao.deleteEmployee(employeeID);
		if(deletedEmployee==null) {
			throw new NotFoundException("The Employee with id "+employeeID+" was not found!");
		}
		return deletedEmployee;
	}

	@Override
	public employee updateEmployee(int employeeID, employee employee) {
		// TODO Auto-generated method stub
		employee updatedEmployee=dao.updateEmployee(employeeID, employee);
		if(updatedEmployee==null) {
			throw new NotFoundException("The Employee with id "+employeeID+" was not found!");
		}
		return updatedEmployee;
	}

	@Override
	public employee getEmployee(int employeeID) {
		// TODO Auto-generated method stub
		employee getEmployee=dao.getEmployee(employeeID);
		
		if(getEmployee==null) {
			throw new NotFoundException("The Employee with id "+employeeID+" was not found!");
		}
		return getEmployee;
	}

	@Override
	public List<employee> getEmployees() {
		// TODO Auto-generated method stub
		return dao.getEmployees();
	}

}
