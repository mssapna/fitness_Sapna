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

import com.crnt.fitness_club.bean.UserProgressBean;
import com.crnt.fitness_club.service.UserProgressService;



@RestController
@RequestMapping("/user")
public class UserProgressController {

	@Autowired
	UserProgressService service;
	
	@PostMapping("/saveNewProgress")
	public UserProgressBean saveNewUser(@RequestBody UserProgressBean bean)
	{
		return service.saveNewProgress(bean);
		
	}
	
	@GetMapping("fetch/{progressId}")
	public UserProgressBean getById(@PathVariable Integer progressId)
	{
		return service.getById(progressId);
	}
	
	@GetMapping("/fetchall")
	public List<UserProgressBean> getAll()
	{
		return service.getAllProgress();
	}
	
	@PutMapping("/update")
	public UserProgressBean update(@RequestBody UserProgressBean bean)
	{
		return service.updateProgress(bean);
		
	}

	@DeleteMapping("/delete/{progressId}")
	public String deleteStudent(@PathVariable Integer progressId)
	{
		return service.deleteById(progressId);
	}

}
