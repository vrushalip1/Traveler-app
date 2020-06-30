package com.codeapp.TravelerApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.codeapp.TravelerApp.model.User;

@Component
@Repository
public interface RegistrationRepo extends JpaRepository<User,Long>{
	
	User findByEmail(String email);

}
