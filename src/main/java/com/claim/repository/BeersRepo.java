package com.claim.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.claim.entity.Beer;

@Repository
public interface BeersRepo extends JpaRepository<Beer, Integer>{

	@Query("Select B.beerName from Beer B")
	List<String> getAllBeerNames();

}
	

