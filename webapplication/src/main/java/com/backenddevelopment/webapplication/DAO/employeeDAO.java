package com.backenddevelopment.webapplication.DAO;

import java.util.List;

import org.springframework.stereotype.Component;

import com.backenddevelopment.webapplication.entities.employee;
@Component
public interface employeeDAO {
       public employee createEmployee(employee employee);
       public employee deleteEmployee(int employeeID);
       public employee updateEmployee(int employeeID,employee employee);
       public employee getEmployee(int employeeID);
       public List<employee> getEmployees();
       
       
}
