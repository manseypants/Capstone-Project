package com.claim.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.claim.entity.Beer;
import com.claim.repository.BeersRepo;

@Service
public class BeersService {
	
	@Autowired
	BeersRepo beersRepo;
	
	public void saveBeers(Beer beers) {
		beersRepo.save(beers);
	}
	
	public List<Beer> getAllBeers(){
		return beersRepo.findAll();
	}
	
	public Optional<Beer> getBeersById(int beerNumber) {
		return beersRepo.findById(beerNumber);
	}
	
	public List<String> getAllBeerNames(){
		return beersRepo.getAllBeerNames();
	}
}
