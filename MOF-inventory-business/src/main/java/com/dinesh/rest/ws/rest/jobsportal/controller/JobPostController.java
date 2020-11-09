package com.dinesh.rest.ws.rest.jobsportal.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dinesh.rest.ws.rest.jobsportal.entity.JobLocation;
import com.dinesh.rest.ws.rest.jobsportal.entity.JobPost;
import com.dinesh.rest.ws.rest.jobsportal.entity.UserAccount;
import com.dinesh.rest.ws.rest.jobsportal.entity.UserType;
import com.dinesh.rest.ws.rest.jobsportal.entity.dto.UserRegistrationDTO;
import com.dinesh.rest.ws.rest.jobsportal.repository.JobPostRepository;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class JobPostController {
	private static final Logger LOGGER = LoggerFactory.getLogger(JobPostController.class);

	@Autowired
	private JobPostRepository jobPostRepository;

	@Autowired
	JobLocationRepo jobLocationRepo;

	@PostMapping("/jpa/jobs/create")
	@ResponseBody
	public ResponseEntity<JobPost> registerUser(@RequestBody JobPost jobPost) {

		JobPost jobpostsSaved = jobPostRepository.save(jobPost);

		JobLocation joblocation = jobPost.getJobLocation();

		if (joblocation != null) {
			int locationID = joblocation.getId();
			boolean exists = jobLocationRepo.existsById(locationID);

			if (!exists) {
				jobLocationRepo.save(joblocation);
			}

		}

		LOGGER.info("LOGGER:=" + jobPost);

		ResponseEntity<JobPost> savedJobPost = new ResponseEntity<JobPost>(jobpostsSaved, HttpStatus.OK);

		return savedJobPost;
	}

	@GetMapping("/jpa/jobs/findall")
	@ResponseBody
	public List<JobPost> getAllJobs() {
		List<JobPost> jobpostList = jobPostRepository.findAll();
		return jobpostList;
	}

	@GetMapping("jpa/products/fetch")
	public List<Product> greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name) {

		List<Product> productList = productList();

		return productList;
	}
	


	class Link{
		String id;
		String title;
		
		public Link() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Link(String id, String title) {
			super();
			this.id = id;
			this.title = title;
		}
		
		
	}
	

	private static List<Product> productList() {
		List<Product> productlist = new ArrayList<>();
		Product product1 = new Product(1, "Dell laptop", "$1000");
		Product product2 = new Product(2, "Lenevo laptop", "$750");
		Product product3 = new Product(3, "HP laptop", "$500");
		Product product4 = new Product(4, "laptop", "$100a0");
		Product product5 = new Product(5, "Lenop laptop", "$700");
		Product product6 = new Product(6, "HP laptop", "$500");

		// Add Image:
		product1.setImageUrl("https://i.ibb.co/xzLsJRb/laptop.jpg");

		product2.setImageUrl("https://i.ibb.co/wW79bFP/laptop2.jpg");
		product3.setImageUrl("https://i.ibb.co/xzLsJRb/laptop.jpg");
		product4.setImageUrl("https://i.ibb.co/xzLsJRb/laptop.jpg");

		product5.setImageUrl("https://i.ibb.co/wW79bFP/laptop2.jpg");
		product6.setImageUrl("https://i.ibb.co/xzLsJRb/laptop.jpg");

		productlist.add(product1);
		productlist.add(product2);
		productlist.add(product3);
		productlist.add(product4);
		productlist.add(product5);
		productlist.add(product6);
		return productlist;
	}

}
