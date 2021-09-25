package com.example912.demo912.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example912.demo912.model.User;
@Component
public class UserRepository {
 private List <User> lUser;
 public UserRepository(){
	 lUser=new ArrayList<User>();// easy to initialize in constructor
 }
 
 //Create
 public User saveUser(User user) {
	 lUser.add(user);
	 return user;
 }
 
 //read
 public List<User> readUsers(){
	 return lUser;
 }
 //update
 
 //delete
}
