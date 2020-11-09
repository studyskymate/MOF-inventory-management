package com.dinesh.rest.ws.rest.jobsportal.entity.dto;
import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import java.util.Date;
import java.util.List;


/**
 * The persistent class for the job_post database table.
 * 
 */
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class JobPost implements Serializable {
	private static final long serialVersionUID = 1L;


	private int id;


	private Date createdDate;


	private String isActive;


	private String isCompanyNameHidden;


	private String jobDescription;


	private Company company;


	private JobLocation jobLocation;


	@JsonIgnoreProperties

	private JobType jobType;

	

	@JsonIgnoreProperties

	private UserAccount userAccount;

	

	@JsonIgnoreProperties
	private List<JobPostActivity> jobPostActivities;



	@JsonIgnoreProperties
	private List<JobPostSkillSet> jobPostSkillSets;

	public JobPost() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getIsActive() {
		return this.isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getIsCompanyNameHidden() {
		return this.isCompanyNameHidden;
	}

	public void setIsCompanyNameHidden(String isCompanyNameHidden) {
		this.isCompanyNameHidden = isCompanyNameHidden;
	}

	public String getJobDescription() {
		return this.jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	public Company getCompany() {
		return this.company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public JobLocation getJobLocation() {
		return this.jobLocation;
	}

	public void setJobLocation(JobLocation jobLocation) {
		this.jobLocation = jobLocation;
	}

	public JobType getJobType() {
		return this.jobType;
	}

	public void setJobType(JobType jobType) {
		this.jobType = jobType;
	}

	public UserAccount getUserAccount() {
		return this.userAccount;
	}

	public void setUserAccount(UserAccount userAccount) {
		this.userAccount = userAccount;
	}

	public List<JobPostActivity> getJobPostActivities() {
		return this.jobPostActivities;
	}

	public void setJobPostActivities(List<JobPostActivity> jobPostActivities) {
		this.jobPostActivities = jobPostActivities;
	}

	public JobPostActivity addJobPostActivity(JobPostActivity jobPostActivity) {
		getJobPostActivities().add(jobPostActivity);
		jobPostActivity.setJobPost(this);

		return jobPostActivity;
	}

	public JobPostActivity removeJobPostActivity(JobPostActivity jobPostActivity) {
		getJobPostActivities().remove(jobPostActivity);
		jobPostActivity.setJobPost(null);

		return jobPostActivity;
	}

	public List<JobPostSkillSet> getJobPostSkillSets() {
		return this.jobPostSkillSets;
	}

	public void setJobPostSkillSets(List<JobPostSkillSet> jobPostSkillSets) {
		this.jobPostSkillSets = jobPostSkillSets;
	}

	public JobPostSkillSet addJobPostSkillSet(JobPostSkillSet jobPostSkillSet) {
		getJobPostSkillSets().add(jobPostSkillSet);
		jobPostSkillSet.setJobPost(this);

		return jobPostSkillSet;
	}

	public JobPostSkillSet removeJobPostSkillSet(JobPostSkillSet jobPostSkillSet) {
		getJobPostSkillSets().remove(jobPostSkillSet);
		jobPostSkillSet.setJobPost(null);

		return jobPostSkillSet;
	}

}