package com.claim.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.claim.entity.Rep;

@Repository
public interface UserRepo extends JpaRepository<Rep, Integer>{
	
	@Query("Select R from Rep R where email =:email and password =:password")
	public Rep login(@Param("email") String email, @Param("password") String password);
}
