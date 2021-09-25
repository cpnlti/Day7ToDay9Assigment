package com.example912.demo912.service;

import java.util.List;

import com.example912.demo912.model.User;

public interface IUserService {

	public User creatUser(User user);
	
	public List<User> getAllUSers();

	public User getUser(int userid);

	public int deleteUser(int userid);

	public void updateAge(int uid);
}
