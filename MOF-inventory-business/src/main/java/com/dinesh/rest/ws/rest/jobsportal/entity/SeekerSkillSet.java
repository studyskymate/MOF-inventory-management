package com.dinesh.rest.ws.rest.jobsportal.entity;
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
@Entity
@Table(name="seeker_skill_set")
@NamedQuery(name="SeekerSkillSet.findAll", query="SELECT s FROM SeekerSkillSet s")
public class SeekerSkillSet implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SeekerSkillSetPK id;

	@Column(name="skill_level", nullable=false)
	private int skillLevel;

	//bi-directional many-to-one association to SkillSet
	@ManyToOne(fetch=FetchType.LAZY)
	//@JsonBackReference
	@JsonIgnoreProperties
	@JoinColumn(name="skill_set_id", nullable=false, insertable=false, updatable=false)
	private SkillSet skillSet;

	//bi-directional many-to-one association to SeekerProfile
	@ManyToOne(fetch=FetchType.LAZY)
	//@JsonBackReference
	@JsonIgnoreProperties
	@JoinColumn(name="user_account_id", nullable=false, insertable=false, updatable=false)
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