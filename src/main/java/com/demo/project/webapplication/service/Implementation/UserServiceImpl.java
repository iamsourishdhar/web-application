package com.demo.project.webapplication.service.Implementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.project.webapplication.models.User;
import com.demo.project.webapplication.service.IF.UserServiceIF;

@Service
public class UserServiceImpl implements UserServiceIF {
	private static List<User> userList = new ArrayList<>();
	int count=userList.size();
	static {
		userList.add(new User(1, "Sourish Dhar", "09/12/1995"));
		userList.add(new User(2, "Soumya Ghosh", "24/05/1996"));
		userList.add(new User(3, "Rishov Majumder", "19/05/1995"));

	}
	
	@Override
	public List<User> retreiveAllUsers() {
		return userList;
	}
	
	@Override
	public String addUser(User user) throws Exception{
		if (user.getUserId()==0) {
			user.setUserId(Long.valueOf(count));
			userList.add(user);
			return "Success";
		}
		throw new Exception("Invalid User");

	}

}
