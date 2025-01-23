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

import com.security.entity.EmpEntity;
import com.security.request.EmpRequest;
import com.security.service.EmpService;



@RestController
public class EmpController {
	@Autowired
    private EmpService empService;
	
	@PostMapping("/insertdata")
	public String inseretData(@RequestBody EmpRequest empreq) {
		return empService.insertData(empreq);
	}
	
	@PutMapping("/updateData")
	public String updateData(@RequestBody EmpRequest empreq) {
		
		
		return empService.updateData(empreq);
	}
	
	@DeleteMapping("/deletedata/{id}")
	public String deleteData(@PathVariable int id) {
		return empService.deleteData(id);
	}
	@GetMapping("/fetchData")
	public List<EmpEntity> fetchData() {
		return empService.fetchData();
	}
	@GetMapping("/fetchData/{id}")
	public Optional<EmpEntity> fetchDataById(@PathVariable int id) {
		return empService.fetchDataById(id);
	}
}
