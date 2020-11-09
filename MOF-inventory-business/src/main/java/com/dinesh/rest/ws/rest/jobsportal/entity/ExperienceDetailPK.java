package com.dinesh.rest.ws.rest.jobsportal.entity;
import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * The primary key class for the experience_detail database table.
 * 
 */
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Embeddable
public class ExperienceDetailPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="user_account_id", insertable=false, updatable=false, unique=true, nullable=false)
	private int userAccountId;

	@Temporal(TemporalType.DATE)
	@Column(name="start_date", unique=true, nullable=false)
	private java.util.Date startDate;

	@Temporal(TemporalType.DATE)
	@Column(name="end_date", unique=true, nullable=false)
	private java.util.Date endDate;

	public ExperienceDetailPK() {
	}
	public int getUserAccountId() {
		return this.userAccountId;
	}
	public void setUserAccountId(int userAccountId) {
		this.userAccountId = userAccountId;
	}
	public java.util.Date getStartDate() {
		return this.startDate;
	}
	public void setStartDate(java.util.Date startDate) {
		this.startDate = startDate;
	}
	public java.util.Date getEndDate() {
		return this.endDate;
	}
	public void setEndDate(java.util.Date endDate) {
		this.endDate = endDate;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ExperienceDetailPK)) {
			return false;
		}
		ExperienceDetailPK castOther = (ExperienceDetailPK)other;
		return 
			(this.userAccountId == castOther.userAccountId)
			&& this.startDate.equals(castOther.startDate)
			&& this.endDate.equals(castOther.endDate);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.userAccountId;
		hash = hash * prime + this.startDate.hashCode();
		hash = hash * prime + this.endDate.hashCode();
		
		return hash;
	}
}