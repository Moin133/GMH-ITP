package com.company;

public class Car {

	private String maker;
	private String countryOfOrigin;
	private String color;
	private String engine;
	private int modelYear;
	private int noOfDoors;
	private int startingPrice;
	private int wheels;
	
	public Car(String maker, String countryOfOrigin,String color, String engine, int modelYear, int noOfDoors, int startingPrice) {
		this.maker = maker;
		this.countryOfOrigin = countryOfOrigin;
		this.color = color;
		this.engine = engine;
		this.modelYear = modelYear;
		this.noOfDoors = noOfDoors;
		this.startingPrice = startingPrice;
		this.wheels = 4;		
		
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public int getModelYear() {
		return modelYear;
	}

	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}

	public int getNoOfDoors() {
		return noOfDoors;
	}

	public void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}

	public int getStartingPrice() {
		return startingPrice;
	}

	public void setStartingPrice(int startingPrice) {
		this.startingPrice = startingPrice;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public String getcolor() {
		return color;
	}
	
	public void setcolor(String color) {
		this.color = color;
	}
	
	public void engineStart() {
		System.out.println("The engine has started");
	}
	
	public void acceleration() {
		System.out.println("The car is accelerating");
	}
	
	public void brake() {
		System.out.println("The car is decreasinig speed");
	}
	
	public void wiper() {
		System.out.println("The wiper is turned on");
	}	
	
}
