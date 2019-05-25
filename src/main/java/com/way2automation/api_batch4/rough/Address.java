package com.way2automation.api_batch4.rough;

public class Address {
	
	private String flatno;
	private String city;
	private String state;
	private String country;
	
	public Address(String flatno,String city,String state,String country)
	{
		this.flatno=flatno;
		this.city=city;
		this.state=state;
		this.country=country;
	}

	public String getFlatno() {
		return flatno;
	}

	public void setFlatno(String flatno) {
		this.flatno = flatno;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	
	

}
