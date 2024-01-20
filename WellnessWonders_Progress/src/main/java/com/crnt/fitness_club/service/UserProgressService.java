package com.crnt.fitness_club.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.crnt.fitness_club.bean.UserProgressBean;



@Service
public interface UserProgressService {

public	UserProgressBean saveNewProgress(UserProgressBean bean);

public UserProgressBean getById(Integer userId);

public List<UserProgressBean> getAllProgress();

public UserProgressBean updateProgress(UserProgressBean bean);



public String deleteById(Integer progressId);

}
