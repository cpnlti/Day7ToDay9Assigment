package com.example912.demo912.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example912.demo912.model.User;
import com.example912.demo912.service.IUserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	IUserService uservice;
	//MyCompenent myComponent;
	@PostMapping("/create")
	public User met1(@RequestBody User user) {
		return uservice.createUser(user);
	}
	@GetMapping("/getall")
 public List<User> met2(){
		return uservice.getAllUsers();
 }
	
	/*@GetMapping("/get/")
	 public List<User> met3(@RequestParam("uid")int uid ){
			return uservice.getUser(uid);
		 
	 }*/
}
