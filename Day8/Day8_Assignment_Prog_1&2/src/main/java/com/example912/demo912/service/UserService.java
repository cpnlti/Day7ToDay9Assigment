package com.example912.demo912.service;

//import java.awt.print.Pageable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import com.example912.demo912.model.User;
import com.example912.demo912.repo.IUserRepository;
import com.example912.demo912.repo.UserRepository;

@Service
public class UserService implements IUserService {
 
	@Autowired
	private UserRepository urepo;
	
	@Autowired
	private IUserRepository Iurepo;
	
	@Override
	public User creatUser(User user) {
		
		User tuser= Iurepo.save(user);
		return tuser;
	}

	@Override
	public List<User> getAllUSers() {
		//Pageable paging = PageRequest.of(2, 3, Sort.by("id").descending().and(Sort.by("age")));
	//	List<User> luser = Iurepo.findAll(paging).getContent();
		Pageable page=PageRequest.of(1, 3,Sort.by("id").descending().and(Sort.by("age")));

		List<User> luser=Iurepo.findAll(page).getContent();
		Iurepo.addSalutationToName("hello");
		luser.stream().forEach((user)->{System.out.println(user);});
		
		return luser;
	} 

	@Override

	public User getUser(int userid) {

	return Iurepo.findById((long)userid).get();

	}

	@Override
	public int deleteUser(int userid) {
		Iurepo.deleteById((long)userid);
		return	userid;
	}
	
	@Override
	public void updateAge(int uid) {
	  Iurepo.updateUserAgeById(uid);
	}
}
