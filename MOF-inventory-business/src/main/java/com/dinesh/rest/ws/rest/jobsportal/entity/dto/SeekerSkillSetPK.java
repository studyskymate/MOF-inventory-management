package com.dinesh.rest.ws.rest.jobsportal.entity.dto;
import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * The primary key class for the seeker_skill_set database table.
 * 
 */
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SeekerSkillSetPK implements Serializable {
	
	private static final long serialVersionUID = 1L;

	
	private int userAccountId;

	
	private int skillSetId;

	public SeekerSkillSetPK() {
	}
	public int getUserAccountId() {
		return this.userAccountId;
	}
	public void setUserAccountId(int userAccountId) {
		this.userAccountId = userAccountId;
	}
	public int getSkillSetId() {
		return this.skillSetId;
	}
	public void setSkillSetId(int skillSetId) {
		this.skillSetId = skillSetId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SeekerSkillSetPK)) {
			return false;
		}
		SeekerSkillSetPK castOther = (SeekerSkillSetPK)other;
		return 
			(this.userAccountId == castOther.userAccountId)
			&& (this.skillSetId == castOther.skillSetId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.userAccountId;
		hash = hash * prime + this.skillSetId;
		
		return hash;
	}
}