package com.springwebapp;

import org.springframework.stereotype.Component;

@Component
public class Address {

	private String country;
	private int pincode;
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [country=" + country + ", pincode=" + pincode + "]";
	}
}
