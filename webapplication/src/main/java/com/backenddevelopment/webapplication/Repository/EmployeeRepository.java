package com.backenddevelopment.webapplication.Repository;

import javax.persistence.Id;

import org.springframework.data.repository.CrudRepository;

import com.backenddevelopment.webapplication.entities.employee;

public interface EmployeeRepository extends CrudRepository< employee, Integer> {

}
