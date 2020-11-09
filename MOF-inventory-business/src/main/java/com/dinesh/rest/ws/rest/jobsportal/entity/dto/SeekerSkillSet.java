package com.dinesh.rest.ws.rest.jobsportal.entity.dto;
import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


/**
 * The persistent class for the seeker_skill_set database table.
 * 
 */
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SeekerSkillSet implements Serializable {
	private static final long serialVersionUID = 1L;


	private SeekerSkillSetPK id;


	private int skillLevel;



	@JsonIgnoreProperties
	private SkillSet skillSet;

	

	@JsonIgnoreProperties
	private SeekerProfile seekerProfile;

	public SeekerSkillSet() {
	}

	public SeekerSkillSetPK getId() {
		return this.id;
	}

	public void setId(SeekerSkillSetPK id) {
		this.id = id;
	}

	public int getSkillLevel() {
		return this.skillLevel;
	}

	public void setSkillLevel(int skillLevel) {
		this.skillLevel = skillLevel;
	}

	public SkillSet getSkillSet() {
		return this.skillSet;
	}

	public void setSkillSet(SkillSet skillSet) {
		this.skillSet = skillSet;
	}

	public SeekerProfile getSeekerProfile() {
		return this.seekerProfile;
	}

	public void setSeekerProfile(SeekerProfile seekerProfile) {
		this.seekerProfile = seekerProfile;
	}

}