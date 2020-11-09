package com.dinesh.rest.ws.rest.jobsportal.entity.dto;
import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * The primary key class for the job_post_skill_set database table.
 * 
 */
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class JobPostSkillSetPK implements Serializable {
	
	private static final long serialVersionUID = 1L;

	
	private int skillSetId;

	
	private int jobPostId;

	public JobPostSkillSetPK() {
	}
	public int getSkillSetId() {
		return this.skillSetId;
	}
	public void setSkillSetId(int skillSetId) {
		this.skillSetId = skillSetId;
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
		if (!(other instanceof JobPostSkillSetPK)) {
			return false;
		}
		JobPostSkillSetPK castOther = (JobPostSkillSetPK)other;
		return 
			(this.skillSetId == castOther.skillSetId)
			&& (this.jobPostId == castOther.jobPostId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.skillSetId;
		hash = hash * prime + this.jobPostId;
		
		return hash;
	}
}