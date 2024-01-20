package com.crnt.fitness_club.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crnt.fitness_club.bean.UserRegistrationBean;
@Repository
public interface UserRegistrationRepository extends JpaRepository<UserRegistrationBean, Integer>{

}
