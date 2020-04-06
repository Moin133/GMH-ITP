package com.company;

public class Rectangle extends Shape implements Resizable {

	private double width;
	private double length;
	private double area;
	private double perimeter;
	
	public Rectangle(int numSides, double width, double length) {
		super (numSides);
		widthvalue(width);
		lengthvalue(length);			
	}
	
	public void widthvalue(double width) {
		if(width<=0) {
			System.out.println("The value of width cannot be negative or zero, please start again"); 
			System.exit(-1);
			}
		else {this.width = width;}
	}
	public void lengthvalue(double length) {
		if(length<=0) {
			System.out.println("The value of length cannot be negative or zero, please start again");
			System.exit(-1);
		}
		else {this.length = length;}
	}
	
	@Override
	public void getArea() { 
		area = width * length; 
		System.out.println("The area of this rectangle is " +area+" square meter" );
		}
	public void getPerimeter() {
		perimeter = 2 * (width + length);
		System.out.println("The perimeter of this rectangle is " +perimeter+" meter");
	}
	@Override
	public void resize(double x) {
		this.width = Math.pow(width, x);
		this.length = Math.pow(length, x);		
	}
	
}
