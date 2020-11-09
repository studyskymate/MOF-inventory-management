package com.dinesh.rest.ws.rest.jobsportal.entity.dto;
import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import java.util.List;


/**
 * The persistent class for the skill_set database table.
 * 
 */
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SkillSet implements Serializable {
	private static final long serialVersionUID = 1L;


	private int id;

	
	private String skillSetName;

	
	@JsonIgnoreProperties
	private List<JobPostSkillSet> jobPostSkillSets;

	
	@JsonIgnoreProperties
	private List<SeekerSkillSet> seekerSkillSets;

	public SkillSet() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSkillSetName() {
		return this.skillSetName;
	}

	public void setSkillSetName(String skillSetName) {
		this.skillSetName = skillSetName;
	}

	public List<JobPostSkillSet> getJobPostSkillSets() {
		return this.jobPostSkillSets;
	}

	public void setJobPostSkillSets(List<JobPostSkillSet> jobPostSkillSets) {
		this.jobPostSkillSets = jobPostSkillSets;
	}

	public JobPostSkillSet addJobPostSkillSet(JobPostSkillSet jobPostSkillSet) {
		getJobPostSkillSets().add(jobPostSkillSet);
		jobPostSkillSet.setSkillSet(this);

		return jobPostSkillSet;
	}

	public JobPostSkillSet removeJobPostSkillSet(JobPostSkillSet jobPostSkillSet) {
		getJobPostSkillSets().remove(jobPostSkillSet);
		jobPostSkillSet.setSkillSet(null);

		return jobPostSkillSet;
	}

	public List<SeekerSkillSet> getSeekerSkillSets() {
		return this.seekerSkillSets;
	}

	public void setSeekerSkillSets(List<SeekerSkillSet> seekerSkillSets) {
		this.seekerSkillSets = seekerSkillSets;
	}

	public SeekerSkillSet addSeekerSkillSet(SeekerSkillSet seekerSkillSet) {
		getSeekerSkillSets().add(seekerSkillSet);
		seekerSkillSet.setSkillSet(this);

		return seekerSkillSet;
	}

	public SeekerSkillSet removeSeekerSkillSet(SeekerSkillSet seekerSkillSet) {
		getSeekerSkillSets().remove(seekerSkillSet);
		seekerSkillSet.setSkillSet(null);

		return seekerSkillSet;
	}

}