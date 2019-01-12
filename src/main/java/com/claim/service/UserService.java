package com.claim.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.claim.entity.Rep;
import com.claim.repository.UserRepo;

@Service
public class UserService {
	
	@Autowired
	UserRepo userRepo;
	
	public void saveUser(Rep rep) {
		userRepo.save(rep);
	}
	
	
	public Rep loginUser(Rep rep) {
		return userRepo.login(rep.getEmail(), rep.getPassword());
	}

}
