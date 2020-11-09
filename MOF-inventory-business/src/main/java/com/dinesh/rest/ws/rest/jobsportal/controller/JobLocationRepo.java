package com.dinesh.rest.ws.rest.jobsportal.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dinesh.rest.ws.rest.jobsportal.entity.JobLocation;

@Repository
public interface JobLocationRepo extends JpaRepository<JobLocation, Integer>{
	
}
