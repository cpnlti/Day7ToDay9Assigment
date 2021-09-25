package com.example912.demo912.controller;

import java.util.List;
import java.util.Map;

//import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example912.demo912.exception.UserNotFoundException;
import com.example912.demo912.model.User;
import com.example912.demo912.service.IUserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private IUserService userService;
	
	@PostMapping("/creatuser")
	//public User met1(@Valid @RequestBody User user) {
		public User met1( @RequestBody User user) {
		return userService.creatUser(user);
	}
	
	@GetMapping("/getusers")
	public List<User> met2() {
		return userService.getAllUSers();
	}
	
	@GetMapping("/get")
	public User met3(@RequestParam("uid") int uid, @RequestHeader Map<String, String> headers) {
		
		headers.forEach((hname, hvalue) -> {System.out.println(hname+ "->"+ hvalue);});
		return userService.getUser(uid);
		
	}
	
	@DeleteMapping("/{uid}")
    public ResponseEntity met4(@PathVariable("uid") int uid) throws UserNotFoundException{
        if(userService.deleteUser(uid)==0)
        {
            throw new UserNotFoundException(uid+"");
        }
        else {
        	return ResponseEntity.ok()
        	        .header("Custom-Header", "User deleted")
        	        .body("User got deleted : " + uid);
        }
    }
	@PutMapping("/updateage")

	public void met5(@RequestParam("uid") int uid) {

		userService.updateAge(uid);

	}
}
