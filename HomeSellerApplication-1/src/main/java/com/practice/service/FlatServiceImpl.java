package com.practice.service;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.dao.FlatDao;
import com.practice.entities.Flat;
// this class contains business Logic
@Service
public class FlatServiceImpl  implements FlatService{
	// to inject Dao layer object Automatically
	@Autowired
	private FlatDao flatdao;
  //List<Flat> list;
  //all implemented Method For FlatService
	@Override
	public List<Flat> getFlats() {
		
		return flatdao.findAll();
	}
  public FlatServiceImpl() {
	 
  }
	@Override
	public List<Flat> getFlatsWithLocation(String  Location) {
		List<Flat> dao=flatdao.findByLocation(Location);
		return dao;
	}
	@Override
	public List<Flat> getFlatsWithSize(String Size) {
		List<Flat> dao1=flatdao.findBySize(Size);
		return dao1;
	}
	@Override
	public List<Flat> getFlatsWithlowPrice(String price) {
		List<Flat> dao2=flatdao.findSortedFlatprice();
		return dao2;
	}
	
	
	

}
