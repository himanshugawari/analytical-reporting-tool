package com.himanshu.art.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.himanshu.art.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
}
