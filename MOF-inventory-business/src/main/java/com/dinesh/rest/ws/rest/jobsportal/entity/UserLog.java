package com.dinesh.rest.ws.rest.jobsportal.entity;
import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import java.util.Date;


/**
 * The persistent class for the user_log database table.
 * 
 */
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name="user_log")
@NamedQuery(name="UserLog.findAll", query="SELECT u FROM UserLog u")
public class UserLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="user_account_id", unique=true, nullable=false)
	private int userAccountId;

	@Temporal(TemporalType.DATE)
	@Column(name="last_job_apply_date")
	private Date lastJobApplyDate;

	@Temporal(TemporalType.DATE)
	@Column(name="last_login_date", nullable=false)
	private Date lastLoginDate;

	//bi-directional one-to-one association to UserAccount

	//@JsonBackReference
	@JsonIgnoreProperties
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="user_account_id", nullable=false, insertable=false, updatable=false)
	private UserAccount userAccount;

	public UserLog() {
	}

	public int getUserAccountId() {
		return this.userAccountId;
	}

	public void setUserAccountId(int userAccountId) {
		this.userAccountId = userAccountId;
	}

	public Date getLastJobApplyDate() {
		return this.lastJobApplyDate;
	}

	public void setLastJobApplyDate(Date lastJobApplyDate) {
		this.lastJobApplyDate = lastJobApplyDate;
	}

	public Date getLastLoginDate() {
		return this.lastLoginDate;
	}

	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	public UserAccount getUserAccount() {
		return this.userAccount;
	}

	public void setUserAccount(UserAccount userAccount) {
		this.userAccount = userAccount;
	}

}