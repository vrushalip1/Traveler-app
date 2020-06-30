package com.codeapp.TravelerApp.service;

import org.springframework.stereotype.Service;

import com.codeapp.TravelerApp.dto.UserLogin;
import com.codeapp.TravelerApp.model.User;

@Service
public interface RegistrationService {
	
	User createUser(User usr);
	
	User login(UserLogin ulogin);
	
}
