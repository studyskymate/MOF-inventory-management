package com.dinesh.rest.ws.rest.jobsportal.entity;
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
//@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name="company")
@NamedQuery(name="Company.findAll", query="SELECT c FROM Company c")
public class Company implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="company_name", nullable=false, length=100)
	private String companyName;

	@Column(name="company_website_url", nullable=false, length=500)
	private String companyWebsiteUrl;

	@Temporal(TemporalType.DATE)
	@Column(name="establishment_date", nullable=false)
	private Date establishmentDate;

	@Column(name="profile_description", nullable=false, length=1000)
	private String profileDescription;

	//bi-directional many-to-one association to BusinessStream
	@ManyToOne(fetch=FetchType.LAZY)
	
	 @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	//@JsonManagedReference
	@JoinColumn(name="business_stream_id", nullable=false)
	private BusinessStream businessStream;

	//bi-directional many-to-one association to CompanyImage
	@JsonIgnoreProperties
	//@JsonManagedReference
	@OneToMany(mappedBy="company")
	private List<CompanyImage> companyImages;

	//bi-directional many-to-one association to JobPost
	
	/*
	 * @OneToMany(mappedBy="company")
	 * 
	 * @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) private
	 * List<JobPost> jobPosts;
	 */

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

	/*
	 * public CompanyImage removeCompanyImage(CompanyImage companyImage) {
	 * getCompanyImages().remove(companyImage); companyImage.setCompany(null);
	 * 
	 * return companyImage; }
	 * 
	 * public List<JobPost> getJobPosts() { return this.jobPosts; }
	 * 
	 * public void setJobPosts(List<JobPost> jobPosts) { this.jobPosts = jobPosts; }
	 * 
	 * public JobPost addJobPost(JobPost jobPost) { getJobPosts().add(jobPost);
	 * jobPost.setCompany(this);
	 * 
	 * return jobPost; }
	 * 
	 * public JobPost removeJobPost(JobPost jobPost) {
	 * getJobPosts().remove(jobPost); jobPost.setCompany(null);
	 * 
	 * return jobPost; }
	 */

}