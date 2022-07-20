package com.backenddevelopment.webapplication.entities;

import org.springframework.stereotype.Component;

public class employee {
	
	private int employeeID;
	private String employeeEmail;
	private String employeeName;
	private static int counter=1000;
	
	
	
	public employee(int employeeID, String employeeEmail, String employeeName) {
		this.employeeID = ++counter;
		this.employeeEmail = employeeEmail;
		this.employeeName = employeeName;
	}
	
	
	
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	
	

}
