package com.dinesh.rest.ws.rest.jobsportal.entity.dto;
import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


/**
 * The persistent class for the job_post_skill_set database table.
 * 
 */
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)

public class JobPostSkillSet implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private JobPostSkillSetPK id;

	
	private int skillLevel;

	
	

	@JsonIgnoreProperties
	private JobPost jobPost;



	@JsonIgnoreProperties
	private SkillSet skillSet;

	public JobPostSkillSet() {
	}

	public JobPostSkillSetPK getId() {
		return this.id;
	}

	public void setId(JobPostSkillSetPK id) {
		this.id = id;
	}

	public int getSkillLevel() {
		return this.skillLevel;
	}

	public void setSkillLevel(int skillLevel) {
		this.skillLevel = skillLevel;
	}

	public JobPost getJobPost() {
		return this.jobPost;
	}

	public void setJobPost(JobPost jobPost) {
		this.jobPost = jobPost;
	}

	public SkillSet getSkillSet() {
		return this.skillSet;
	}

	public void setSkillSet(SkillSet skillSet) {
		this.skillSet = skillSet;
	}



}