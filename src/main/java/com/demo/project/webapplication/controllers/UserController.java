package com.demo.project.webapplication.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.project.webapplication.models.User;
import com.demo.project.webapplication.service.IF.UserServiceIF;

@RestController
public class UserController {
	
	@Autowired
	private UserServiceIF userServiceIF;
	@Value("${microservices.name}")
	private String componentName;
	
		
	@RequestMapping(method = RequestMethod.GET, path = "/hello-world")
	public String printHelloWorld() {
		return "Hello from the other side";
	}
	@RequestMapping(method = RequestMethod.GET, path = "/")
	public String printWelcome() {
		return "Welcome to openshift";
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/allusers")
	public List<User> retrieveAllUsers() {
		return userServiceIF.retreiveAllUsers();
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/jpa/allusers")
	public List<User> retrieveAllUsersFromDB() {
		return userServiceIF.retreiveAllUsersFromDB();
	}
	
	
	@RequestMapping(method = RequestMethod.POST, path = "/addusers")
	public ResponseEntity<String> addUser(@RequestBody User user) throws Exception {
		String str = userServiceIF.addUser(user);
		return new ResponseEntity<String>(str, HttpStatus.CREATED);
	}
	
	@GetMapping(path = "/testyaml")
	public void displayYamlValues() {
		System.out.println("Component Name " + componentName);
	}
}
