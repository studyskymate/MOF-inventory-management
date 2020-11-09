package com.dinesh.rest.ws.rest.jobsportal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dinesh.rest.ws.rest.jobsportal.entity.UserAccount;
import com.dinesh.rest.ws.rest.jobsportal.entity.UserType;

@Repository
public interface UserAccountRepositoryDup extends JpaRepository<UserAccount, Integer> {
	
	public List<UserAccount> findByUserType(UserType userType);
	public List<UserAccount> findByEmail(String email);
	public UserAccount findByUsername(String username);
	
}
