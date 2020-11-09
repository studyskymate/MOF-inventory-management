package com.dinesh.rest.inventory.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dinesh.rest.inventory.entity.Inventory;

@RestController
public class InventoryController {

	
	@GetMapping("/api/v1/inventory")
	public List<Inventory> getInventories(){
		
		return null;
	}
	
	@PostMapping("/api/v1/inventory")
	public ResponseEntity<Void> saveInventories(@RequestBody Inventory inventory){
		
		return null;
	}
	
}
