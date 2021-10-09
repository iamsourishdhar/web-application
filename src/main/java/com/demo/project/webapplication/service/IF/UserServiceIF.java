package com.demo.project.webapplication.service.IF;

import java.util.List;

import com.demo.project.webapplication.models.User;

public interface UserServiceIF {
	
	List<User> retreiveAllUsers();
	
	String addUser(User user)throws Exception;

}
