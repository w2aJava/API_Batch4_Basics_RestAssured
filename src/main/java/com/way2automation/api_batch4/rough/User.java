package com.way2automation.api_batch4.rough;

import java.util.ArrayList;
import java.util.List;

public class User {
	
	private String email;
	private String firstname;
	private String lastname;
	
	private ArrayList<Integer> mobile;
	private Address address;
	
	
	public User(String email,String firstname,String lastname,String flatno,String city,String state,String country)
	{
		this.email=email;
		this.firstname=firstname;
		this.lastname=lastname;
		this.mobile= new ArrayList<Integer>();
		this.address= new Address(flatno, city, state, country);
	}
	
	
	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public ArrayList<Integer> getMobile() {
		return mobile;
	}


	public void setMobile(ArrayList<Integer> mobile) {
		this.mobile = mobile;
	}


	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public void setMobileNumbers(int... mobileNumbers)
	{
	   for(int i=0;i<mobileNumbers.length;i++)
	   {
		   this.mobile.add(mobileNumbers[i]);
	   }
	  
	  
	}
	
	
}
