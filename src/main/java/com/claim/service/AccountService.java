package com.claim.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.claim.entity.Account;
import com.claim.repository.AccountRepo;

@Service
public class AccountService {
	
	@Autowired
	AccountRepo accountRepo;
	
	public void saveAccount(Account account) {
		accountRepo.save(account);
	}
	
	public List<Account> getAllAccounts(){
		return accountRepo.findAll();
	}

	public List<String> getAllAccountName(){
		return accountRepo.getAllAccountName();
	}

	public Optional<Account> getTaskByName(String accountName) {
		return accountRepo.findById(accountName);
	}
	
	//public Optional<Account> getAccountById(String accountName){
	//	return accountRepo.findById(accountName);
	//}
}
