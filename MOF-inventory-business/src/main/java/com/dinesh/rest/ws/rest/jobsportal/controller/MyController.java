package com.dinesh.rest.ws.rest.jobsportal.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class MyController {
	
	@GetMapping("/jpa/link")
	@ResponseBody
	public List<Link> getLink() {

		List<Link> list= new ArrayList<>();
		
		Link link= new Link(1,"dinesh");
		Link link2= new Link(2,"dinesh2");
		Link link3= new Link(3,"dinesh3");
		
		System.out.println("link"+link);
          list.add(link);
          list.add(link2);
          list.add(link3);
		
		return list;
	}

	
	@PostMapping("/jpa/link/save")
	public String save(@RequestBody String request) {
		try {
			System.out.println("GOT request"+request);
		return "Welcome";
		}catch(Exception ex) {
			System.out.println(ex);
		}
		return "Welcome";
	}
	
	
}
