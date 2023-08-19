package com.practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.entities.Flat;
import com.practice.service.FlatService;

//this the request handler get,post,update ,Delete
@RestController
@RequestMapping("/AvailableHome")
public class MyController {
	//to inject the service layer object Automatically using @Autowired
@Autowired
 private FlatService service;

//get the All Flats

  @GetMapping("/GetAllFlats")
   public List<Flat> getFlats(){
	 return  service.getFlats();
	}


 //Get the Available flats with specific location
 @GetMapping("/SpecificLocation/{Location}")
  public ResponseEntity<List<Flat>> getFlats(@PathVariable("Location") String Location){
	 
	  List<Flat> flat = service.getFlatsWithLocation(Location);
		return ResponseEntity.ok().body(flat);
	}
//Get the Available flats with specific bedroom size
 @GetMapping("/SpecificSize/{size}")
 public ResponseEntity<List<Flat>> getFlatsWithSize(@PathVariable("size") String size){
	 
	  List<Flat> flat = service.getFlatsWithSize(size);
		return ResponseEntity.ok().body(flat);
	}
 @GetMapping("/LowPriceFlats/{price}")
 public ResponseEntity<List<Flat>> getFlatWithLowPrice(@PathVariable("price") String price){
	 
	  List<Flat> flat = service.getFlatsWithlowPrice(price);
		return ResponseEntity.ok().body(flat);
	}
}
