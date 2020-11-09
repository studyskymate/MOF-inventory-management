package com.dinesh.rest.ws.rest.jobsportal.controller;

import java.sql.Date;

import java.util.List;
import java.util.Optional;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dinesh.rest.ws.rest.jobsportal.entity.UserAccount;
import com.dinesh.rest.ws.rest.jobsportal.entity.UserType;
import com.dinesh.rest.ws.rest.jobsportal.entity.dto.UserRegistrationDTO;
import com.dinesh.rest.ws.rest.jobsportal.repository.UserAccountRepositoryDup;
import com.dinesh.rest.ws.rest.jobsportal.repository.UsersTypeRepositorydup;
import com.dinesh.rest.ws.rest.jobsportal.service.JobsPortalService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class JobsPortalController {

	private static final Logger LOGGER = LoggerFactory.getLogger(JobsPortalController.class);

	@Autowired
	UserAccountRepositoryDup userAccountRepository;

	@Autowired
	UsersTypeRepositorydup userTypeRepository;

	@PostMapping("/jpa/users/register")
	@ResponseBody
	public ResponseEntity<UserAccount> registerUser(@RequestBody UserRegistrationDTO user) {
		ResponseEntity<UserAccount> userA = null;
		try {
			UserAccount userEntity = new UserAccount();
			userEntity.setEmail(user.getConfirmEmail());
			userEntity.setPassword(user.getConfirmPassword());
			String usertypeModel = user.getUserType();
			userEntity.setUsername(user.getUsername());
			UserType userType = userTypeRepository.findByUserTypeName(usertypeModel);
			userEntity.setUserType(userType);

			UserAccount userAccount = userAccountRepository.save(userEntity);

			LOGGER.info("LOGGER:=" + user.toString());
			userA = new ResponseEntity<UserAccount>(userAccount, HttpStatus.OK);

		} catch (Exception ex) {
			System.out.println(ex);
		}
		return userA;
	}

	@PostMapping("/jpa/users/save")
	@ResponseBody
	public ResponseEntity<UserAccount> saveUser(@RequestBody UserAccount user) throws Exception {
		System.out.println("hii");
		String password = "";
		System.out.println("Pass"+user.getPassword());
	System.out.println("password");
		
	/*
	 * if (user.getPassword() != null) password = new
	 * BCryptPasswordEncoder().encode(user.getPassword());
	 * user.setPassword(password);
	 */
		
		
		
		System.out.println("Pass"+user.getPassword());
	 
		 UserAccount userEntity =
		 userAccountRepository.findByUsername(user.getUsername());
		 
		 userEntity.setFirstname(user.getFirstname());
	 userEntity.setLasttname(user.getLasttname());
		 userEntity.setContactNumber(user.getContactNumber());
	
	 UserAccount userAccount = userAccountRepository.save(userEntity);
		
	

	//	UserAccount userAccount = userAccountRepository.save(user);

		ResponseEntity<UserAccount> userA = new ResponseEntity<UserAccount>(userAccount, HttpStatus.OK);
		return userA;

	}

	@GetMapping("/jpa/users/save")
	public UserAccount saveUser() {
		UserAccount user = new UserAccount();
		UserType usertype = new UserType();
		usertype.setId(1);
		usertype.setUserTypeName("C");

		userTypeRepository.save(usertype);

		user.setPassword("1233");
		user.setEmail("d@d.com");
		user.setContactNumber("121212");
		user.setEmail("a.com");
		user.setUserType(usertype);
		String str = "2015-03-31";
		user.setDateOfBirth(Date.valueOf(str));
		user.setGender("M");
		System.out.println("User" + user.toString());

		userAccountRepository.save(user);

		return user;

	}

	@GetMapping("/jpa/jobs/users")
	public List<UserAccount> getAllUsersByType() {

		Optional<UserType> usertypeo = userTypeRepository.findById(2);

		UserType userType = usertypeo.get();

		List<UserAccount> userAccount = userAccountRepository.findByUserType(userType);

		return userAccount;
	}

	@GetMapping("/jpa/jobs/users/{id}")
	public UserAccount getUserById(@PathVariable int id) {
		UserAccount userAccountList = null;
		try {
			Optional<UserAccount> userAccount = userAccountRepository.findById(id);

			if (userAccount.isPresent()) {
				userAccountList = userAccount.get();
			}

		} catch (Exception ex) {
			System.out.println("Error" + ex);
		}
		return userAccountList;

	}

	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/jpa/jobs/users/fetch/{username}")
	public UserAccount getUserByUsername(@PathVariable String username) {
		UserAccount userAccount = null;
		try {
			userAccount = userAccountRepository.findByUsername(username);
            System.out.println("User fetched:" +userAccount);
		} catch (Exception ex) {
			System.out.println("Error" + ex);
		}
		return userAccount;
	}

}
