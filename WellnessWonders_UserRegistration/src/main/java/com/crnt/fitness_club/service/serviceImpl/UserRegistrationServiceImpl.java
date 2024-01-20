package com.crnt.fitness_club.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crnt.fitness_club.bean.UserRegistrationBean;
import com.crnt.fitness_club.repository.UserRegistrationRepository;
import com.crnt.fitness_club.service.UserRegistrationService;

@Service
public class UserRegistrationServiceImpl implements UserRegistrationService {
	
	@Autowired
	UserRegistrationRepository repository;

	@Override
	public UserRegistrationBean saveNewUser(UserRegistrationBean bean) {
		// TODO Auto-generated method stub
		return repository.save(bean);
	}

	@Override
	public UserRegistrationBean getById(Integer userId) {
		// TODO Auto-generated method stub
		return repository.findById(userId).get();
	}

	@Override
	public List<UserRegistrationBean> getAllStudent() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public UserRegistrationBean update(UserRegistrationBean bean) {
		
		return repository.save(bean);
	}

	@Override
	public String deleteById(Integer userId) {
		// TODO Auto-generated method stub
	repository.deleteById(userId);
	return "student deleted";
	}
	
	

}
