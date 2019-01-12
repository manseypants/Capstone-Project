package com.claim.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.claim.entity.Account;
	
	@Repository
	public interface AccountRepo extends JpaRepository<Account, String>{

		@Query("Select A.accountName from Account A")
		List<String> getAllAccountName();

}
