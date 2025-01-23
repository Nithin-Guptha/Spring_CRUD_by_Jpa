package com.security.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.security.entity.EmpEntity;
import com.security.repo.EmpRepo;
import com.security.request.EmpRequest;

@Service
public class EmpService {
	@Autowired
	private EmpRepo empRepo;

	
	public String insertData(EmpRequest empreq) {
		EmpEntity empentity=new EmpEntity();
		empentity.setId(empreq.getId());
		empentity.setEname(empreq.getEname());
		empentity.setSal(empreq.getSal());
		empentity.setRole(empreq.getRole());
		 empRepo.save(empentity);
		 return "success";
	}


	public String updateData(EmpRequest empreq) {
		EmpEntity empentity=new EmpEntity();
		empentity.setId(empreq.getId());
		empentity.setEname(empreq.getEname());
		empentity.setSal(empreq.getSal());
		empentity.setRole(empreq.getRole());
		 empRepo.save(empentity);
		 return"updated";
	}


	public String deleteData(int id) {
		empRepo.deleteById(id);
		return "deleted";
	}


	public List<EmpEntity> fetchData() {
		
		return empRepo.findAll();
	}


	public Optional<EmpEntity> fetchDataById(int id) {
		
		return empRepo.findById(id);
	}

}
