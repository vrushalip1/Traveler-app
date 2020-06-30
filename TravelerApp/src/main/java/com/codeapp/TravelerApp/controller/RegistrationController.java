package com.codeapp.TravelerApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codeapp.TravelerApp.dto.UserLogin;
import com.codeapp.TravelerApp.model.User;
import com.codeapp.TravelerApp.service.RegistrationService;

@RestController
@RequestMapping("/usrreg")
public class RegistrationController {
	
	@Autowired
	public RegistrationService reg;
	
	@PutMapping("/user")
	public User createUser(@RequestBody User usr) {
		return reg.createUser(usr);
		
	}
	
	@PostMapping("/login")
	public User login(@RequestBody UserLogin ulogin) {
		return reg.login(ulogin); 
	}
	
}
