package com.dinesh.rest.ws.rest.jobsportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dinesh.rest.ws.rest.jobsportal.entity.JobPost;


@Repository
public interface JobPostRepository extends JpaRepository<JobPost, Integer> {

}
