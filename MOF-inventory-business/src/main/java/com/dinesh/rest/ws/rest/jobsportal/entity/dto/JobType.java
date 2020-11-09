package com.dinesh.rest.ws.rest.jobsportal.entity.dto;
import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import java.util.List;


/**
 * The persistent class for the job_type database table.
 * 
 */
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)

public class JobType implements Serializable {
	private static final long serialVersionUID = 1L;


	private int id;


	private String jobType;


	@JsonIgnoreProperties
	private List<JobPost> jobPosts;

	public JobType() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getJobType() {
		return this.jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	public List<JobPost> getJobPosts() {
		return this.jobPosts;
	}

	public void setJobPosts(List<JobPost> jobPosts) {
		this.jobPosts = jobPosts;
	}

	public JobPost addJobPost(JobPost jobPost) {
		getJobPosts().add(jobPost);
		jobPost.setJobType(this);

		return jobPost;
	}

	public JobPost removeJobPost(JobPost jobPost) {
		getJobPosts().remove(jobPost);
		jobPost.setJobType(null);

		return jobPost;
	}

}