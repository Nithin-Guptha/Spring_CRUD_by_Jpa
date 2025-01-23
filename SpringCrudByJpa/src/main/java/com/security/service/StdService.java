package com.security.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.security.entity.StdEntity;
import com.security.repo.StdRepo;
import com.security.request.StdRequest;

@Service
public class StdService {
	
	@Autowired
	public StdRepo stdRepo;
	
	public String insert(StdRequest insertStd) {
		StdEntity stdEntity = new StdEntity();
		stdEntity.setRollno(insertStd.getRollno());
		stdEntity.setSname(insertStd.getSname());
		stdEntity.setBranch(insertStd.getBranch());
		stdEntity.setSec(insertStd.getSec());
		stdEntity.setYear(insertStd.getYear());
		stdRepo.save(stdEntity);
		return "inserted";
	}

	public String update(StdRequest updateStd) {
		StdEntity stdEntity = new StdEntity();
		stdEntity.setRollno(updateStd.getRollno());
		stdEntity.setSname(updateStd.getSname());
		stdEntity.setBranch(updateStd.getBranch());
		stdEntity.setSec(updateStd.getSec());
		stdEntity.setYear(updateStd.getYear());
		stdRepo.save(stdEntity);
		return "updated";
	}

	public String delete(int rollno) {
		stdRepo.deleteById(rollno);
		return "deleted";
	}

	public List<StdEntity> fetchAll() {
		return stdRepo.findAll();
		
	}

	public Optional<StdEntity> fetchById(int rollno) {
		
		return stdRepo.findById(rollno);
	}

	
}
