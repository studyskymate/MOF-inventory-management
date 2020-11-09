package com.dinesh.rest.ws.rest.jobsportal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.dinesh.rest.ws.rest.jobsportal.entity.UserAccount;
import com.dinesh.rest.ws.rest.jobsportal.repository.UserAccountRepositoryDup;

@Service
public class JobsPortalService {

	@Autowired
	UserAccountRepositoryDup userAccountRepo;
	
	public UserAccount save(UserAccount userAccount ) {
		UserAccount userAc=userAccountRepo.save(userAccount);
		return userAc;
	}
}
