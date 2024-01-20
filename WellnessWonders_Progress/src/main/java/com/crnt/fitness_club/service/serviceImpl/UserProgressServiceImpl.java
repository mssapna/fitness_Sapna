package com.crnt.fitness_club.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crnt.fitness_club.bean.UserProgressBean;
import com.crnt.fitness_club.repository.UserProgressRepository;
import com.crnt.fitness_club.service.UserProgressService;


@Service
public class UserProgressServiceImpl implements UserProgressService {
	
	@Autowired
	UserProgressRepository repository;

	@Override
	public UserProgressBean saveNewProgress(UserProgressBean bean) {
		// TODO Auto-generated method stub
		return repository.save(bean);
	}

	@Override
	public UserProgressBean getById(Integer userId) {
		// TODO Auto-generated method stub
		return repository.findById(userId).get();
	}

	@Override
	public List<UserProgressBean> getAllProgress() {
		
		return repository.findAll();
	}

	@Override
	public UserProgressBean updateProgress(UserProgressBean bean) {
		
		return repository.save(bean);
	}

	@Override
	public String deleteById(Integer progressId) {
		
	repository.deleteById(progressId);
	return "data deleted";
	}

	
}
