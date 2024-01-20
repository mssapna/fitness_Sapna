package com.crnt.fitness_club.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserRegistrationBean {
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
private Integer userId;
private String firstName;
private String middleName;
private String lastName;
private String gender;
private float currentWeight;
private float desiredWeight;
private float height;
private String email;
private String address;
private long phoneNumber;

public UserRegistrationBean()
{
	
}

public Integer getUserId() {
	return userId;
}

public void setUserId(Integer userId) {
	this.userId = userId;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getMiddleName() {
	return middleName;
}

public void setMiddleName(String middleName) {
	this.middleName = middleName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public float getCurrentWeight() {
	return currentWeight;
}

public void setCurrentWeight(float currentWeight) {
	this.currentWeight = currentWeight;
}

public float getDesiredWeight() {
	return desiredWeight;
}

public void setDesiredWeight(float desiredWeight) {
	this.desiredWeight = desiredWeight;
}

public float getHeight() {
	return height;
}

public void setHeight(float height) {
	this.height = height;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public long getPhoneNumber() {
	return phoneNumber;
}

public void setPhoneNumber(long phoneNumber) {
	this.phoneNumber = phoneNumber;
}

@Override
public String toString() {
	return "UserRegistrationBean [userId=" + userId + ", firstName=" + firstName + ", middleName=" + middleName
			+ ", lastName=" + lastName + ", gender=" + gender + ", currentWeight=" + currentWeight + ", desiredWeight="
			+ desiredWeight + ", height=" + height + ", email=" + email + ", address=" + address + ", phoneNumber="
			+ phoneNumber + "]";
}

public UserRegistrationBean(Integer userId, String firstName, String middleName, String lastName, String gender,
		float currentWeight, float desiredWeight, float height, String email, String address, long phoneNumber) {
	super();
	this.userId = userId;
	this.firstName = firstName;
	this.middleName = middleName;
	this.lastName = lastName;
	this.gender = gender;
	this.currentWeight = currentWeight;
	this.desiredWeight = desiredWeight;
	this.height = height;
	this.email = email;
	this.address = address;
	this.phoneNumber = phoneNumber;
}


}
