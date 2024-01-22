package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.User;

@Repository
public interface UserRepository extends JpaRepository<User , Integer>{



	public User findByEmailid(String emailid);
	
	public User findByEmailidAndPassword(String emailid,String password);

}
