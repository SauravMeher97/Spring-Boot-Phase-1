package com.backenddevelopment.webapplication.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;


@Entity
public class employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int employeeID;
	private String employeeEmail;
	private String employeeName;
	private static int counter=1000;
	
	public employee( ){
	}
	
	public employee(int employeeID, String employeeEmail, String employeeName) {
		this.employeeID = employeeID;
		this.employeeEmail = employeeEmail;
		this.employeeName = employeeName;
	}
	public employee( String employeeEmail, String employeeName) {
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

	@Override
	public String toString() {
		return "employee [employeeID=" + employeeID + ", employeeEmail=" + employeeEmail + ", employeeName="
				+ employeeName + "]";
	}
	
	

}
