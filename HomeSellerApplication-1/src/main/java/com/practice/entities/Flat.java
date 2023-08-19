package com.practice.entities;





import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity 
@Table(name="flat")
public class Flat {
@Id
private int id;
@Column
private String Size;
@Column
private String Location;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getSize() {
	return Size;
}
@Override
public String toString() {
	return "Flat [id=" + id + ", Size=" + Size + ", Location=" + Location + ", price=" + price + "]";
}
public void setSize(String size) {
	Size = size;
}
public String getLocation() {
	return Location;
}
public void setLocation(String location) {
	Location = location;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
public Flat() {
	super();
	// TODO Auto-generated constructor stub
}
public Flat(int id, String size, String location, String price) {
	super();
	this.id = id;
	Size = size;
	Location = location;
	this.price = price;
}
@Column
private String price;

}
