package com.company;

public abstract class Shape implements Resizable{

	private int numSides;
	
	public Shape(int numSides) {this.numSides = numSides;}
	
	public int getnumSides() {return numSides;}
	
	public abstract void getArea();
	public abstract void getPerimeter();
	
	
	
}
