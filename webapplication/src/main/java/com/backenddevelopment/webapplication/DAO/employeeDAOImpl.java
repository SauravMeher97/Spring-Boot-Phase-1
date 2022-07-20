package com.backenddevelopment.webapplication.DAO;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

import com.backenddevelopment.webapplication.entities.employee;

@Component
public class employeeDAOImpl implements employeeDAO {
    private static int counter=1000;
    private static List<employee> employees = new ArrayList<employee>();
    
    static {
    	employees.add(new employee(++counter,"Saurav","Saurav@gmail.com"));
    	employees.add(new employee(++counter,"Aruna","Aruna@gmail.com"));
    	employees.add(new employee(++counter,"Meher","Meher@gmail.com"));
    }
    
	@Override
	public employee createEmployee(employee employee) {
		employee saveEmployee = employee;
		employees.add(saveEmployee);
		return saveEmployee;
	}

	@Override
	public employee deleteEmployee(int employeeID) {
		employee tempemployee=null;
		Iterator<employee> iter = employees.iterator();
		while(iter.hasNext()) {
		    tempemployee = iter.next();
			if(tempemployee.getEmployeeID()==employeeID) {
				iter.remove();
				break;
			}
		}
		
		return tempemployee;
	}

	@Override
	public employee updateEmployee(int employeeID, employee employee) {
		// TODO Auto-generated method stub
		employee tempemployee = null;
	    for(employee updateemployee:employees) {
	    	if(updateemployee.getEmployeeID()==employeeID) {
	    		updateemployee.setEmployeeName(employee.getEmployeeName());
	    		updateemployee.setEmployeeEmail(employee.getEmployeeEmail());
	    		tempemployee=updateemployee;
	    		break;
	    	}
	    }
			
		return tempemployee;
	}

	@Override
	public employee getEmployee(int employeeID) {
	    employee tempemployee = null;
	    for(employee employee:employees) {
	    	if(employee.getEmployeeID()==employeeID) {
	    		tempemployee=employee;
	    		break;
	    	}
	    }
			
		return tempemployee;
	}

	@Override
	public List<employee> getEmployees() {
	   return employees;
	}

}
