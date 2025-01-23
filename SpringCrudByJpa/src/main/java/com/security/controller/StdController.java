package com.security.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.security.entity.StdEntity;
import com.security.request.StdRequest;
import com.security.service.StdService;



@RestController
public class StdController {
	
	@Autowired
	private StdService stdService;
	
	@PostMapping("/insert")
	public String insert(@RequestBody StdRequest insertStd) {		
		return stdService.insert(insertStd);
	}
	
	@PutMapping("/update")
	public String update(@RequestBody StdRequest updateStd) {
		
		return stdService.update(updateStd);
	}
	
	@DeleteMapping("/delete/{rollno}")
	public String delete(@PathVariable int rollno) {
		return stdService.delete(rollno);
	}
	
	@GetMapping("/fetch")
	public List<StdEntity> fetchAll() {
		return stdService.fetchAll();
	}
	
	@GetMapping("/fetch/{rollno}")
	public Optional<StdEntity> fetchById(@PathVariable int rollno) {
		return stdService.fetchById(rollno);
	}
	
	
	
}
