package com.himanshu.art.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.himanshu.art.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	

}
