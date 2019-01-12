package com.claim.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.claim.entity.CustomerOrder;
import com.claim.repository.CustomerOrderRepo;

@Service
public class CustomerOrderService {

	@Autowired
	CustomerOrderRepo customerOrderRepo;
	
	public void save(CustomerOrder customerOrder) {
		customerOrderRepo.save(customerOrder);
	}
	
}
