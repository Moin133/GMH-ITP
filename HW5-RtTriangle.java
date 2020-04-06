package com.company;
import java.lang.Math;

public class RtTriangle extends Shape implements Resizable{
	private double leg1;
	private double leg2;
	private double area;
	private double perimeter;
	
	public RtTriangle(int numSides, double leg1, double leg2) {
		super (numSides);
		widthvalue(leg1);
		lengthvalue(leg2);			
	}
	
	public void widthvalue(double leg1) {
		if(leg1<=0) {
			System.out.println("The value of a leg cannot be negative or zero, please start again");
			System.exit(-1);
		}
		else {this.leg1 = leg1;}
	}
	public void lengthvalue(double leg2) {
		if(leg2<=0) {
			System.out.println("The value of a leg cannot be negative or zero");
			System.exit(-1);
		}
		else {this.leg2 = leg2;}
	}
	
	@Override
	public void getArea() { 
		area = (leg1 * leg2) / 2; 
		System.out.println("The area of this right triangle is " +area+" square meter" );
		}
	public void getPerimeter() {
		double leg11;
		double leg22;
		double sqrtleg;
		leg11 = Math.pow(leg1,2);
		leg22 = Math.pow(leg2,2);
		sqrtleg = leg11+leg22;
		
		perimeter = leg1 + leg2 + Math.sqrt(sqrtleg);
		System.out.println("The perimeter of this right triangle is " +perimeter+" meter");
	}
	@Override
	public void resize(double x) {			
		this.leg1 = Math.pow(leg1, x);
		this.leg2 = Math.pow(leg2, x);
		
	}
	
}
