package com.dinesh.rest.ws.rest.jobsportal.entity;
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
@Entity
@Table(name="seeker_profile")
@NamedQuery(name="SeekerProfile.findAll", query="SELECT s FROM SeekerProfile s")
public class SeekerProfile implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="user_account_id", unique=true, nullable=false)
	private int userAccountId;

	@Column(length=50)
	private String currency;

	@Column(name="current_salary")
	private float currentSalary;

	@Column(name="first_name", nullable=false, length=50)
	private String firstName;

	@Column(name="is_annually_monthly", length=1)
	private String isAnnuallyMonthly;

	@Column(name="last_name", nullable=false, length=50)
	private String lastName;

	//bi-directional many-to-one association to EducationDetail
	@OneToMany(mappedBy="seekerProfile")
	@JsonIgnoreProperties
	//@JsonManagedReference
	private List<EducationDetail> educationDetails;

	//bi-directional many-to-one association to ExperienceDetail
	@OneToMany(mappedBy="seekerProfile")
	@JsonIgnoreProperties
	//@JsonManagedReference
	private List<ExperienceDetail> experienceDetails;

	//bi-directional one-to-one association to UserAccount
	@OneToOne(fetch=FetchType.LAZY)
	//@JsonBackReference
	@JsonIgnoreProperties
	@JoinColumn(name="user_account_id", nullable=false, insertable=false, updatable=false)
	private UserAccount userAccount;

	//bi-directional many-to-one association to SeekerSkillSet
	@OneToMany(mappedBy="seekerProfile")
	//@JsonManagedReference
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