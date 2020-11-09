package com.dinesh.rest.ws.rest.jobsportal.entity;
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
@Entity
@Table(name="experience_detail")
@NamedQuery(name="ExperienceDetail.findAll", query="SELECT e FROM ExperienceDetail e")
public class ExperienceDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ExperienceDetailPK id;

	@Column(name="company_name", nullable=false, length=100)
	private String companyName;

	@Column(nullable=false, length=4000)
	private String description;

	@Column(name="is_current_job", nullable=false, length=1)
	private String isCurrentJob;

	@Column(name="job_location_city", nullable=false, length=50)
	private String jobLocationCity;

	@Column(name="job_location_country", nullable=false, length=50)
	private String jobLocationCountry;

	@Column(name="job_location_state", nullable=false, length=50)
	private String jobLocationState;

	@Column(name="job_title", nullable=false, length=50)
	private String jobTitle;

	//bi-directional many-to-one association to SeekerProfile
	@ManyToOne(fetch=FetchType.LAZY)
	@JsonIgnoreProperties
	//@JsonBackReference
	@JoinColumn(name="user_account_id", nullable=false, insertable=false, updatable=false)
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