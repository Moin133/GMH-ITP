package com.company;

public class Truck extends Car{

	private int bedlength;
	
	
	public Truck(String maker, String countryOfOrigin,String color, String engine, int modelYear, int noOfDoors, int startingPrice, int bedlength) {
		super(maker, countryOfOrigin, color, engine, modelYear, noOfDoors, startingPrice);
		this.bedlength = bedlength;
		
	}

	public int getBedlength() {
		return bedlength;
	}

	public void setBedlength(int bedlength) {
		this.bedlength = bedlength;
	}

	public void differential() {
		System.out.println("This truck has locking differential");
	}
	
	@Override
	public void brake() {
		System.out.println("This truck has vacuum braking system");
	}
	
	public void acceleration() {
		System.out.println("The truck accelerates gradually");
		
	}
	
}
