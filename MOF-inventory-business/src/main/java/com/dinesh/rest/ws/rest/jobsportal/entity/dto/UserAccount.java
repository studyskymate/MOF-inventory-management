package com.dinesh.rest.ws.rest.jobsportal.entity.dto;
import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the user_account database table.
 * 
 */


@JsonIgnoreProperties
public class UserAccount implements Serializable {
	private static final long serialVersionUID = 1L;
	// <form (ngSubmit)="!userForm.invalid && onSave()" #userForm="ngForm">


	private int id;


	private String email;
	

	private String username;
	


	private String password;
	

	private String firstname;
	

	private String lasttname;
	
	

	private String contactNumber;


	private Date dateOfBirth;

	

	private String emailNotificationActive;

	private String gender;

	
	private String isActive;


	private Date registrationDate;


	private String smsNotificationActive;

	private byte[] userImage;


	@JsonIgnoreProperties
	private List<JobPost> jobPosts;


	@JsonIgnoreProperties
	private List<JobPostActivity> jobPostActivities;

	@JsonIgnoreProperties
	private SeekerProfile seekerProfile;

	@JsonIgnoreProperties(ignoreUnknown = true, value = {"userAccounts"})
	private UserType userType;

	
	@JsonIgnoreProperties
	private UserLog userLog;

	public UserAccount() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLasttname() {
		return lasttname;
	}

	public void setLasttname(String lasttname) {
		this.lasttname = lasttname;
	}

	
	public String getContactNumber() {
		return this.contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public Date getDateOfBirth() {
		return this.dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmailNotificationActive() {
		return this.emailNotificationActive;
	}

	public void setEmailNotificationActive(String emailNotificationActive) {
		this.emailNotificationActive = emailNotificationActive;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getIsActive() {
		return this.isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getRegistrationDate() {
		return this.registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getSmsNotificationActive() {
		return this.smsNotificationActive;
	}

	public void setSmsNotificationActive(String smsNotificationActive) {
		this.smsNotificationActive = smsNotificationActive;
	}

	public byte[] getUserImage() {
		return this.userImage;
	}

	public void setUserImage(byte[] userImage) {
		this.userImage = userImage;
	}

	public List<JobPost> getJobPosts() {
		return this.jobPosts;
	}

	public void setJobPosts(List<JobPost> jobPosts) {
		this.jobPosts = jobPosts;
	}


	public List<JobPostActivity> getJobPostActivities() {
		return this.jobPostActivities;
	}

	public void setJobPostActivities(List<JobPostActivity> jobPostActivities) {
		this.jobPostActivities = jobPostActivities;
	}


	public SeekerProfile getSeekerProfile() {
		return this.seekerProfile;
	}

	public void setSeekerProfile(SeekerProfile seekerProfile) {
		this.seekerProfile = seekerProfile;
	}

	public UserType getUserType() {
		return this.userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	public UserLog getUserLog() {
		return this.userLog;
	}

	public void setUserLog(UserLog userLog) {
		this.userLog = userLog;
	}

}