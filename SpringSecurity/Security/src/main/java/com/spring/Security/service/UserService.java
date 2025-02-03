package com.spring.Security.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.Security.models.User;

@Service
public class UserService {
	
	
	List<User> list = new ArrayList<>();
	
	public UserService() {
		list.add(new User("asd", "asd123","asd@gmail.com"));
		list.add(new User("zxc", "zxc123","zxc@gmail.com"));
	}
	
	
	public List<User> getAllUsers(){
		return list;
	}
	
	public User getUser(String username) {
		return list.stream().filter((user)->user.getUsername().equals(username)).findAny().orElse(null);
	}
	
	public User addUser(User user) {
		this.list.add(user);
		return user;
	}
	
	
}
