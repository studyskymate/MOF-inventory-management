package com.dinesh.rest.inventory.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.dinesh.rest.ws.rest.jobsportal.entity.Company;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
public class Inventory {

	@Id
	long id;
	
	public Inventory() {
		super();
		// TODO Auto-generated constructor stub
	}

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="order_id", nullable=false)
	private Order order;
	
}
