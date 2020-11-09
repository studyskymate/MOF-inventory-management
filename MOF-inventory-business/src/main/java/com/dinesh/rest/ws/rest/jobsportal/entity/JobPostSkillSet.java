package com.dinesh.rest.ws.rest.jobsportal.entity;
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
@Entity
@Table(name="job_post_skill_set")
@NamedQuery(name="JobPostSkillSet.findAll", query="SELECT j FROM JobPostSkillSet j")
public class JobPostSkillSet implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private JobPostSkillSetPK id;

	@Column(name="skill_level", nullable=false)
	private int skillLevel;

	//bi-directional many-to-one association to JobPost
	
	@ManyToOne(fetch=FetchType.LAZY)
	
	@JsonIgnoreProperties
	//@JsonBackReference
	@JoinColumn(name="job_post_id", nullable=false, insertable=false, updatable=false)
	private JobPost jobPost;

	//bi-directional many-to-one association to SkillSet
	@ManyToOne(fetch=FetchType.LAZY)
	@JsonIgnoreProperties
	//@JsonManagedReference 
	@JoinColumn(name="skill_set_id", nullable=false, insertable=false, updatable=false)
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