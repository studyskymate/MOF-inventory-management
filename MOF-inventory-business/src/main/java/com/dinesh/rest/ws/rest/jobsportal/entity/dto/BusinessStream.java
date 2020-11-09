package com.dinesh.rest.ws.rest.jobsportal.entity.dto;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import java.util.List;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BusinessStream implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;

	private String businessStreamName;

	/*
	 * @JsonIgnoreProperties private List<Company> companies;
	 */
	public BusinessStream() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBusinessStreamName() {
		return this.businessStreamName;
	}

	public void setBusinessStreamName(String businessStreamName) {
		this.businessStreamName = businessStreamName;
	}

	/*
	 * public List<Company> getCompanies() { return this.companies; }
	 * 
	 * public void setCompanies(List<Company> companies) { this.companies =
	 * companies; }
	 * 
	 * public Company addCompany(Company company) { getCompanies().add(company);
	 * company.setBusinessStream(this);
	 * 
	 * return company; }
	 * 
	 * public Company removeCompany(Company company) {
	 * getCompanies().remove(company); company.setBusinessStream(null);
	 * 
	 * return company; }
	 */
}