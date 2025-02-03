package com.springboot.jpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.springboot.jpa.entities.User;

public interface UserRepository extends  JpaRepository<User, Integer> { // or
//public interface UserRepository extends  CrudRepository<User, Integer>{
	
	// Derived query methods
//	select * form user where name=?;
	public User findByName(String name);
	
	
	public List<User> findByCity(String city);
	
//	select * form user where name=? and city=?;
	public User findByNameAndCity(String name, String city);
}
