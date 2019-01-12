package com.claim.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.claim.entity.Tasks;

@Repository
public interface TaskRepo extends JpaRepository<Tasks, Integer>{

}
