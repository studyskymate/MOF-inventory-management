package com.dinesh.rest.ws.rest.jobsportal.entity.dto;
import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import java.util.Date;
import java.util.List;


/**
 * The persistent class for the company database table.
 * 
 */
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Company implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;

	private String companyName;

	private String companyWebsiteUrl;


	private Date establishmentDate;

	private String profileDescription;

	@JsonIgnoreProperties

	private BusinessStream businessStream;

	@JsonIgnoreProperties

	private List<CompanyImage> companyImages;

	

	@JsonIgnoreProperties
	private List<JobPost> jobPosts;

	public Company() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyWebsiteUrl() {
		return this.companyWebsiteUrl;
	}

	public void setCompanyWebsiteUrl(String companyWebsiteUrl) {
		this.companyWebsiteUrl = companyWebsiteUrl;
	}

	public Date getEstablishmentDate() {
		return this.establishmentDate;
	}

	public void setEstablishmentDate(Date establishmentDate) {
		this.establishmentDate = establishmentDate;
	}

	public String getProfileDescription() {
		return this.profileDescription;
	}

	public void setProfileDescription(String profileDescription) {
		this.profileDescription = profileDescription;
	}

	public BusinessStream getBusinessStream() {
		return this.businessStream;
	}

	public void setBusinessStream(BusinessStream businessStream) {
		this.businessStream = businessStream;
	}

	public List<CompanyImage> getCompanyImages() {
		return this.companyImages;
	}

	public void setCompanyImages(List<CompanyImage> companyImages) {
		this.companyImages = companyImages;
	}

	public CompanyImage addCompanyImage(CompanyImage companyImage) {
		getCompanyImages().add(companyImage);
		companyImage.setCompany(this);

		return companyImage;
	}

	public CompanyImage removeCompanyImage(CompanyImage companyImage) {
		getCompanyImages().remove(companyImage);
		companyImage.setCompany(null);

		return companyImage;
	}

	public List<JobPost> getJobPosts() {
		return this.jobPosts;
	}

	public void setJobPosts(List<JobPost> jobPosts) {
		this.jobPosts = jobPosts;
	}

	public JobPost addJobPost(JobPost jobPost) {
		getJobPosts().add(jobPost);
		jobPost.setCompany(this);

		return jobPost;
	}

	public JobPost removeJobPost(JobPost jobPost) {
		getJobPosts().remove(jobPost);
		jobPost.setCompany(null);

		return jobPost;
	}

}