package com.crnt.fitness_club.bean;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserProgressBean {
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private Integer progressId;
	private Date date;
	private float weight;
	private float bodyMeasurement;
	private float workoutDuration;
	private float caloriesBurned;
	private String achievements;
	private String comments;
	private String goals;
	public Integer getProgressId() {
		return progressId;
	}
	public void setProgressId(Integer progressId) {
		this.progressId = progressId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public float getBodyMeasurement() {
		return bodyMeasurement;
	}
	public void setBodyMeasurement(float bodyMeasurement) {
		this.bodyMeasurement = bodyMeasurement;
	}
	public float getWorkoutDuration() {
		return workoutDuration;
	}
	public void setWorkoutDuration(float workoutDuration) {
		this.workoutDuration = workoutDuration;
	}
	public float getCaloriesBurned() {
		return caloriesBurned;
	}
	public void setCaloriesBurned(float caloriesBurned) {
		this.caloriesBurned = caloriesBurned;
	}
	public String getAchievements() {
		return achievements;
	}
	public void setAchievements(String achievements) {
		this.achievements = achievements;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getGoals() {
		return goals;
	}
	public void setGoals(String goals) {
		this.goals = goals;
	}
	@Override
	public String toString() {
		return "UserProgressBean [progressId=" + progressId + ", date=" + date + ", weight=" + weight
				+ ", bodyMeasurement=" + bodyMeasurement + ", workoutDuration=" + workoutDuration + ", caloriesBurned="
				+ caloriesBurned + ", achievements=" + achievements + ", comments=" + comments + ", goals=" + goals
				+ "]";
	}
	public UserProgressBean(Integer progressId, Date date, float weight, float bodyMeasurement, float workoutDuration,
			float caloriesBurned, String achievements, String comments, String goals) {
		super();
		this.progressId = progressId;
		this.date = date;
		this.weight = weight;
		this.bodyMeasurement = bodyMeasurement;
		this.workoutDuration = workoutDuration;
		this.caloriesBurned = caloriesBurned;
		this.achievements = achievements;
		this.comments = comments;
		this.goals = goals;
	}
	
	public  UserProgressBean()
	{
		
	}
}