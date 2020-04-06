package com.company;

public class PerformanceCar extends Car{

	private int noOfTurbo;
	private String shifterType;
	private String handling;
	
	public PerformanceCar(String maker, String countryOfOrigin,String color, String engine, int modelYear, int noOfDoors, int startingPrice, int noOfTurbo, String shifterType, String handling) {
		super(maker, countryOfOrigin, color, engine, modelYear, noOfDoors, startingPrice);
		this.noOfTurbo = noOfTurbo;
		this.shifterType = shifterType;
		this.handling = handling;
	}

	public int getNoOfTurbo() {
		return noOfTurbo;
	}

	public void setNoOfTurbo(int noOfTurbo) {
		this.noOfTurbo = noOfTurbo;
	}

	public String getShifterType() {
		return shifterType;
	}

	public void setShifterType(String shifterType) {
		this.shifterType = shifterType;
	}
	
	public String getHandling() {
		return handling;
	}

	public void setHandling(String handling) {
		this.handling = handling;
	}
	
	public void shift() {
		System.out.println("The car gives great mileage, thanks to the award winning " +this.shifterType+ " shift");
	}

	public void handling() {
		System.out.println("This car has " +this.handling+ " handling when comes to cornering");
	}
	
	@Override
	public void acceleration() {
		System.out.println("This car uses it's " +this.noOfTurbo+ " turbo-system to accelerate faster than other cars");
	}
	
	public void brake() {
	System.out.println("This car has excellent braking performance due to ceramic brakes");
	}
	
	
	
}
