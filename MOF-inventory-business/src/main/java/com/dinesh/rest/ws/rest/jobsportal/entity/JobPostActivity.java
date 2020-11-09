package com.dinesh.rest.ws.rest.jobsportal.entity;
import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import java.util.Date;


/**
 * The persistent class for the job_post_activity database table.
 * 
 */
//@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name="job_post_activity")
@NamedQuery(name="JobPostActivity.findAll", query="SELECT j FROM JobPostActivity j")
public class JobPostActivity implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private JobPostActivityPK id;

	@Temporal(TemporalType.DATE)
	@Column(name="apply_date", nullable=false)
	private Date applyDate;

	//bi-directional many-to-one association to UserAccount
	@JsonIgnoreProperties
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="user_account_id", nullable=false, insertable=false, updatable=false)
	private UserAccount userAccount;

	//bi-directional many-to-one association to JobPost
	@JsonIgnoreProperties
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="job_post_id", nullable=false, insertable=false, updatable=false)
	private JobPost jobPost;

	public JobPostActivity() {
	}

	public JobPostActivityPK getId() {
		return this.id;
	}

	public void setId(JobPostActivityPK id) {
		this.id = id;
	}

	public Date getApplyDate() {
		return this.applyDate;
	}

	public void setApplyDate(Date applyDate) {
		this.applyDate = applyDate;
	}

	public UserAccount getUserAccount() {
		return this.userAccount;
	}

	public void setUserAccount(UserAccount userAccount) {
		this.userAccount = userAccount;
	}

	public JobPost getJobPost() {
		return this.jobPost;
	}

	public void setJobPost(JobPost jobPost) {
		this.jobPost = jobPost;
	}

}