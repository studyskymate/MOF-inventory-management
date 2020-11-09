package com.dinesh.rest.ws.rest.jobsportal.entity.dto;
import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import java.util.List;


/**
 * The persistent class for the seeker_profile database table.
 * 
 */
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SeekerProfile implements Serializable {
	private static final long serialVersionUID = 1L;

	private int userAccountId;


	private String currency;

	private float currentSalary;


	private String firstName;


	private String isAnnuallyMonthly;


	private String lastName;

	
	@JsonIgnoreProperties
	private List<EducationDetail> educationDetails;



	@JsonIgnoreProperties
	private List<ExperienceDetail> experienceDetails;



	@JsonIgnoreProperties
	private UserAccount userAccount;

	
	@JsonIgnoreProperties
	private List<SeekerSkillSet> seekerSkillSets;

	public SeekerProfile() {
	}

	public int getUserAccountId() {
		return this.userAccountId;
	}

	public void setUserAccountId(int userAccountId) {
		this.userAccountId = userAccountId;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public float getCurrentSalary() {
		return this.currentSalary;
	}

	public void setCurrentSalary(float currentSalary) {
		this.currentSalary = currentSalary;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getIsAnnuallyMonthly() {
		return this.isAnnuallyMonthly;
	}

	public void setIsAnnuallyMonthly(String isAnnuallyMonthly) {
		this.isAnnuallyMonthly = isAnnuallyMonthly;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<EducationDetail> getEducationDetails() {
		return this.educationDetails;
	}

	public void setEducationDetails(List<EducationDetail> educationDetails) {
		this.educationDetails = educationDetails;
	}

	public EducationDetail addEducationDetail(EducationDetail educationDetail) {
		getEducationDetails().add(educationDetail);
		educationDetail.setSeekerProfile(this);

		return educationDetail;
	}

	public EducationDetail removeEducationDetail(EducationDetail educationDetail) {
		getEducationDetails().remove(educationDetail);
		educationDetail.setSeekerProfile(null);

		return educationDetail;
	}

	public List<ExperienceDetail> getExperienceDetails() {
		return this.experienceDetails;
	}

	public void setExperienceDetails(List<ExperienceDetail> experienceDetails) {
		this.experienceDetails = experienceDetails;
	}

	public ExperienceDetail addExperienceDetail(ExperienceDetail experienceDetail) {
		getExperienceDetails().add(experienceDetail);
		experienceDetail.setSeekerProfile(this);

		return experienceDetail;
	}

	public ExperienceDetail removeExperienceDetail(ExperienceDetail experienceDetail) {
		getExperienceDetails().remove(experienceDetail);
		experienceDetail.setSeekerProfile(null);

		return experienceDetail;
	}

	public UserAccount getUserAccount() {
		return this.userAccount;
	}

	public void setUserAccount(UserAccount userAccount) {
		this.userAccount = userAccount;
	}

	public List<SeekerSkillSet> getSeekerSkillSets() {
		return this.seekerSkillSets;
	}

	public void setSeekerSkillSets(List<SeekerSkillSet> seekerSkillSets) {
		this.seekerSkillSets = seekerSkillSets;
	}

	public SeekerSkillSet addSeekerSkillSet(SeekerSkillSet seekerSkillSet) {
		getSeekerSkillSets().add(seekerSkillSet);
		seekerSkillSet.setSeekerProfile(this);

		return seekerSkillSet;
	}

	public SeekerSkillSet removeSeekerSkillSet(SeekerSkillSet seekerSkillSet) {
		getSeekerSkillSets().remove(seekerSkillSet);
		seekerSkillSet.setSeekerProfile(null);

		return seekerSkillSet;
	}

}