package com.codeapp.TravelerApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codeapp.TravelerApp.dto.UserLogin;
import com.codeapp.TravelerApp.model.User;
import com.codeapp.TravelerApp.repository.RegistrationRepo;

@Service
public class RegistrationServiceImpl implements RegistrationService{
	

	@Autowired
	RegistrationRepo regRepo;
	
	@Override
	public User createUser(User usr) {
		
		return regRepo.save(usr);
	}


	@Override
	public User login(UserLogin ulogin) {
		
		User loginuser = regRepo.findByEmail(ulogin.getEmail());
		if(loginuser.getPassword().equals(ulogin.getPassword())) {
			return loginuser;
		} 
		return null;
		
	}
	
}
