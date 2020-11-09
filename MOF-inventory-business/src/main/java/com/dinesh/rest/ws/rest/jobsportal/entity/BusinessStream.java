package com.dinesh.rest.ws.rest.jobsportal.entity;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import java.util.List;


/**
 * The persistent class for the business_stream database table.
 * 
 */
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name="business_stream")
@NamedQuery(name="BusinessStream.findAll", query="SELECT b FROM BusinessStream b")
public class BusinessStream implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="business_stream_name", nullable=false, length=100)
	private String businessStreamName;

	//bi-directional many-to-one association to Company
	
	/*
	 * @OneToMany(mappedBy="businessStream")
	 * 
	 * @JsonIgnoreProperties //@JsonBackReference private List<Company> companies;
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