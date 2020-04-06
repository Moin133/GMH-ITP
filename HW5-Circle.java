package com.company;

public class Circle extends Shape implements Resizable {
	private double r;
	private double area;
	private double circumference;
	
	public Circle(int numSides, double r) {
		super (numSides);
		radius(r);
	}
	
	public void radius(double r) {
		if(r<=0) {
			System.out.println("The value of radius cannot be negative or zero, please start again");
			System.exit(-1);
		}
		else {this.r = r;}
	}
	
	@Override
	public void getArea() {
		area = Math.PI * Math.pow(r,2);
		System.out.println("The area for this circle is "+area+" square meter");		
	}
	public void getPerimeter() {
		circumference =  2 * Math.PI * r;
		System.out.println("The circumference for this circle is "+circumference+" meter");
	}
	@Override
	public void resize(double x) {
		this.r = Math.pow(r, x);
	}	
}
