package com.dinesh.rest.ws.rest.jobsportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dinesh.rest.ws.rest.jobsportal.entity.UserAccount;
import com.dinesh.rest.ws.rest.jobsportal.entity.UserType;

@Repository
public interface UsersTypeRepositorydup extends JpaRepository<UserType, Integer> {

	UserType findByUserTypeName(String  userType);
	
}
