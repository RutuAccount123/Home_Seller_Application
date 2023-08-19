package com.practice.service;

import java.util.List;

import com.practice.entities.Flat;

public interface FlatService {
	//All Unimplemented method for Flat service to make u loose coupling
	public List<Flat> getFlats();
	public List<Flat> getFlatsWithLocation(String Location);
	public List<Flat> getFlatsWithSize(String Size);
	public List<Flat> getFlatsWithlowPrice(String price );
	

}
