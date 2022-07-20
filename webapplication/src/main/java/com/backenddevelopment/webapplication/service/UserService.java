package com.backenddevelopment.webapplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.backenddevelopment.webapplication.DAO.UserDAO;
import com.backenddevelopment.webapplication.entities.user;

@Service
public class UserService {
	
	@Autowired
	private UserDAO dao;
	
	public user getUser(String userName) {
		return dao.getUser(userName);
	}
	

}
