package com.crnt.fitness_club.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.crnt.fitness_club.bean.UserRegistrationBean;
import com.crnt.fitness_club.service.UserRegistrationService;



@RestController
@RequestMapping("/user")
public class UserRegistrationController {

	@Autowired
	UserRegistrationService service;
	
	@PostMapping("/saveNewUser")
	public UserRegistrationBean saveNewUser(@RequestBody UserRegistrationBean bean)
	{
		return service.saveNewUser(bean);
		
	}
	
	@GetMapping("fetch/{userId}")
	public UserRegistrationBean getById(@PathVariable Integer userId)
	{
		return service.getById(userId);
	}
	
	@GetMapping("/fetchall")
	public List<UserRegistrationBean> getAll()
	{
		return service.getAllStudent();
	}
	
	@PutMapping("/update")
	public UserRegistrationBean update(@RequestBody UserRegistrationBean bean)
	{
		return service.update(bean);
		
	}

	@DeleteMapping("/delete/{userId}")
	public String deleteStudent(@PathVariable Integer userId)
	{
		return service.deleteById(userId);
	}

}
