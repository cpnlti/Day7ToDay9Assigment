package com.example912.demo912.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.example912.demo912.model.User;



public interface IUserRepository extends JpaRepository<User, Long>{

	
	List<User> findByAge(int age);
	List<User> findByNameStartingWithAndAgeGreaterThan(String name ,int age);
	
	@Query("SELECT u FROM User u WHERE u.name = :name") //Named parameter
	List<User> findXyz(@Param("name") String name);
	
	@Query(value="select U.name, U.email from user U", nativeQuery=true)
	List<Object[]> findXyz1();
	
	@Query(value="select * from user U", nativeQuery=true)
	List<User> findXyz2();
	
	@Transactional
    @Query("UPDATE User SET name = :salutation || name")
    @Modifying
    void addSalutationToName(@Param("salutation") String salutation);
	
	@Transactional

	@Modifying

	@Query("update User u set u.age = u.age+1 where u.id =?1")

	void updateUserAgeById(Integer uid);
}
