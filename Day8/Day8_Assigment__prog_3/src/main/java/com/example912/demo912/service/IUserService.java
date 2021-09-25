package com.example912.demo912.service;

import java.util.List;

import com.example912.demo912.model.User;

public interface IUserService {
	public void createUser(User user);

	public List<User> getUser();

	public User findById(long id);

	public User update(User user, long l);

	public void deleteUserById(long id);

	public User updatePartially(User user, long id);

	public List<User> findByNameAndCountry(String name, String country);
}
