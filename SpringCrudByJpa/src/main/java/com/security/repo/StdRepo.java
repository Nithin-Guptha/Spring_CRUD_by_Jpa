package com.security.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.security.entity.StdEntity;

@Repository
public interface StdRepo extends JpaRepository<StdEntity,Integer> {

}
