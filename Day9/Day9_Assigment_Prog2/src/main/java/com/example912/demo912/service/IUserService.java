package com.example912.demo912.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.example912.demo912.model.User;

public interface IUserService {
	User save(User user);
	List<User> findAll();
	User getById(long userId);
	void deleteById(long userId);	
	List<User> findByAge(int age);
	List<User> findUserByEmail(@Param("email") String email);


}
