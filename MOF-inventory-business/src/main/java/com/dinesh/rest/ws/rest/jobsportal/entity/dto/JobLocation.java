package com.dinesh.rest.ws.rest.jobsportal.entity.dto;
import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import java.util.List;


/**
 * The persistent class for the job_location database table.
 * 
 */
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class JobLocation implements Serializable {
	private static final long serialVersionUID = 1L;


	private int id;


	private String city;


	private String country;

	
	private String state;


	private String streetAddress;


	private String zip;


	@JsonIgnoreProperties

	private List<JobPost> jobPosts;

	public JobLocation() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStreetAddress() {
		return this.streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getZip() {
		return this.zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public List<JobPost> getJobPosts() {
		return this.jobPosts;
	}

	public void setJobPosts(List<JobPost> jobPosts) {
		this.jobPosts = jobPosts;
	}

	public JobPost addJobPost(JobPost jobPost) {
		getJobPosts().add(jobPost);
		jobPost.setJobLocation(this);

		return jobPost;
	}

	public JobPost removeJobPost(JobPost jobPost) {
		getJobPosts().remove(jobPost);
		jobPost.setJobLocation(null);

		return jobPost;
	}

}