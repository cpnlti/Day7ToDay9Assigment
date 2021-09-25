package com.example912.demo912.repo;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import com.example912.demo912.model.Address;

public interface AddressRepository extends CrudRepository<Address, Long>
{
	
}
