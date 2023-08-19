package com.practice.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.practice.entities.Flat;



public interface FlatDao extends JpaRepository<Flat,Integer>{
  //Query for specific Location
	   @Query(value="select * from flat a where a.Location= :Location", nativeQuery=true)
    List<Flat> findByLocation(String Location);
//Query for Specific bedroom size
	@Query(value="select * from flat a where a.Size= :Size", nativeQuery=true)
    List<Flat> findBySize(String Size);
	//Query for Low to high range price in flats
	@Query(nativeQuery = true, value = "SELECT * FROM Flat ORDER BY price ASC  ")
	List<Flat> findSortedFlatprice();

	

 
	
	


	
}




