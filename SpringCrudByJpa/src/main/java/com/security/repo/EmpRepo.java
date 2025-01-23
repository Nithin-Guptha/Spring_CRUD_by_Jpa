package com.security.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.security.entity.EmpEntity;
@Repository
public interface EmpRepo extends JpaRepository<EmpEntity, Integer>{

}
