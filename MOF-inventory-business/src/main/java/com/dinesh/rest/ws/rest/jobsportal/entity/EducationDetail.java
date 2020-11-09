package com.dinesh.rest.ws.rest.jobsportal.entity;
import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import java.util.Date;


/**
 * The persistent class for the education_detail database table.
 * 
 */
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name="education_detail")
@NamedQuery(name="EducationDetail.findAll", query="SELECT e FROM EducationDetail e")
public class EducationDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private EducationDetailPK id;

	private float cgpa;

	@Temporal(TemporalType.DATE)
	@Column(name="completion_date")
	private Date completionDate;

	@Column(nullable=false, length=50)
	private String institute_university_name;

	private float percentage;

	@Temporal(TemporalType.DATE)
	@Column(name="starting_date", nullable=false)
	private Date startingDate;

	//bi-directional many-to-one association to SeekerProfile
	@ManyToOne(fetch=FetchType.LAZY)
	@JsonIgnoreProperties
	//@JsonBackReference
	@JoinColumn(name="user_account_id", nullable=false, insertable=false, updatable=false)
	private SeekerProfile seekerProfile;

	public EducationDetail() {
	}

	public EducationDetailPK getId() {
		return this.id;
	}

	public void setId(EducationDetailPK id) {
		this.id = id;
	}

	public float getCgpa() {
		return this.cgpa;
	}

	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}

	public Date getCompletionDate() {
		return this.completionDate;
	}

	public void setCompletionDate(Date completionDate) {
		this.completionDate = completionDate;
	}

	public String getInstitute_university_name() {
		return this.institute_university_name;
	}

	public void setInstitute_university_name(String institute_university_name) {
		this.institute_university_name = institute_university_name;
	}

	public float getPercentage() {
		return this.percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	public Date getStartingDate() {
		return this.startingDate;
	}

	public void setStartingDate(Date startingDate) {
		this.startingDate = startingDate;
	}

	public SeekerProfile getSeekerProfile() {
		return this.seekerProfile;
	}

	public void setSeekerProfile(SeekerProfile seekerProfile) {
		this.seekerProfile = seekerProfile;
	}

}