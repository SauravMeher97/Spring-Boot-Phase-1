package com.backenddevelopment.webapplication.service;
import  com.backenddevelopment.webapplication.DAO.*;
import com.backenddevelopment.webapplication.entities.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan
public interface employeeService {
	
	public employee createEmployee(employee employee);
    public employee deleteEmployee(int employeeID);
    public employee updateEmployee(int employeeID,employee employee);
    public employee getEmployee(int employeeID);
    public List<employee> getEmployees();
	
}
