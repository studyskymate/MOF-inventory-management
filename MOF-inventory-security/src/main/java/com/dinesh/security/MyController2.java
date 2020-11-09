package com.dinesh.security;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController2 {

	@GetMapping("get/msg/sec")
public String getmsg() {
	return "Hello Form Library sec";
}
}
