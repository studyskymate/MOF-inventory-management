package com.dinesh.rest.ws.rest.jobsportal.entity;
import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * The primary key class for the education_detail database table.
 * 
 */
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Embeddable
public class EducationDetailPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="user_account_id", insertable=false, updatable=false, unique=true, nullable=false)
	private int userAccountId;

	@Column(name="certificate_degree_name", unique=true, nullable=false, length=50)
	private String certificateDegreeName;

	@Column(unique=true, nullable=false, length=50)
	private String major;

	public EducationDetailPK() {
	}
	public int getUserAccountId() {
		return this.userAccountId;
	}
	public void setUserAccountId(int userAccountId) {
		this.userAccountId = userAccountId;
	}
	public String getCertificateDegreeName() {
		return this.certificateDegreeName;
	}
	public void setCertificateDegreeName(String certificateDegreeName) {
		this.certificateDegreeName = certificateDegreeName;
	}
	public String getMajor() {
		return this.major;
	}
	public void setMajor(String major) {
		this.major = major;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof EducationDetailPK)) {
			return false;
		}
		EducationDetailPK castOther = (EducationDetailPK)other;
		return 
			(this.userAccountId == castOther.userAccountId)
			&& this.certificateDegreeName.equals(castOther.certificateDegreeName)
			&& this.major.equals(castOther.major);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.userAccountId;
		hash = hash * prime + this.certificateDegreeName.hashCode();
		hash = hash * prime + this.major.hashCode();
		
		return hash;
	}
}