package com.example912.demo912.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example912.demo912.model.User;


public interface UserRepository extends CrudRepository<User, Long>
{
	List<User> findByNameAndCountry(String name, String country);

}
