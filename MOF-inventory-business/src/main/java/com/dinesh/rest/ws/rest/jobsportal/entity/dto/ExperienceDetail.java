package com.dinesh.rest.ws.rest.jobsportal.entity.dto;
import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


/**
 * The persistent class for the experience_detail database table.
 * 
 */
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExperienceDetail implements Serializable {
	private static final long serialVersionUID = 1L;


	private ExperienceDetailPK id;


	private String companyName;


	private String description;


	private String isCurrentJob;

	private String jobLocationCity;


	private String jobLocationCountry;


	private String jobLocationState;


	private String jobTitle;



	@JsonIgnoreProperties
	private SeekerProfile seekerProfile;

	public ExperienceDetail() {
	}

	public ExperienceDetailPK getId() {
		return this.id;
	}

	public void setId(ExperienceDetailPK id) {
		this.id = id;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIsCurrentJob() {
		return this.isCurrentJob;
	}

	public void setIsCurrentJob(String isCurrentJob) {
		this.isCurrentJob = isCurrentJob;
	}

	public String getJobLocationCity() {
		return this.jobLocationCity;
	}

	public void setJobLocationCity(String jobLocationCity) {
		this.jobLocationCity = jobLocationCity;
	}

	public String getJobLocationCountry() {
		return this.jobLocationCountry;
	}

	public void setJobLocationCountry(String jobLocationCountry) {
		this.jobLocationCountry = jobLocationCountry;
	}

	public String getJobLocationState() {
		return this.jobLocationState;
	}

	public void setJobLocationState(String jobLocationState) {
		this.jobLocationState = jobLocationState;
	}

	public String getJobTitle() {
		return this.jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public SeekerProfile getSeekerProfile() {
		return this.seekerProfile;
	}

	public void setSeekerProfile(SeekerProfile seekerProfile) {
		this.seekerProfile = seekerProfile;
	}

}