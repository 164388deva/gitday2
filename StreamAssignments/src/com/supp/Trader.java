package com.supp;

public class Trader {
	 private String name, city;

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public Trader(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Trader [name=" + name + ", city=" + city + "]";
	} 
}
