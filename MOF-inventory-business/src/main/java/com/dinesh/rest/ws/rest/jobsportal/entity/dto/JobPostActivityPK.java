package com.dinesh.rest.ws.rest.jobsportal.entity.dto;
import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * The primary key class for the job_post_activity database table.
 * 
 */
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)

public class JobPostActivityPK implements Serializable {

	private static final long serialVersionUID = 1L;


	private int userAccountId;

	
	private int jobPostId;

	public JobPostActivityPK() {
	}
	public int getUserAccountId() {
		return this.userAccountId;
	}
	public void setUserAccountId(int userAccountId) {
		this.userAccountId = userAccountId;
	}
	public int getJobPostId() {
		return this.jobPostId;
	}
	public void setJobPostId(int jobPostId) {
		this.jobPostId = jobPostId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof JobPostActivityPK)) {
			return false;
		}
		JobPostActivityPK castOther = (JobPostActivityPK)other;
		return 
			(this.userAccountId == castOther.userAccountId)
			&& (this.jobPostId == castOther.jobPostId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.userAccountId;
		hash = hash * prime + this.jobPostId;
		
		return hash;
	}
}