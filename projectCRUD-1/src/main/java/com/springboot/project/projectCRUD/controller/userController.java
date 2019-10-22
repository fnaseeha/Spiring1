package com.springboot.project.projectCRUD.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.springboot.project.projectCRUD.repoitory.userRepository;

@Controller
public class userController {
	
	@Autowired
	userRepository repository;

	@GetMapping("/user")
	public String getUsers(Model model){
		model.addAttribute("userss",repository.findAll());
		return "user";
	}
}
