package com.company;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("NOTE: All the inputs must follow metric system");
		
		Scanner in1 = new Scanner(System.in);
		System.out.println("Please enter the number of sides (0=Cricle, 3=Triangle, 4=Rectangle)");
		String sides = in1.nextLine();
		
		int operation = Integer.valueOf(sides);
		
		switch(operation) {
		//for circle		
		case 0:
			Scanner in8 = new Scanner(System.in);
			System.out.println("Please enter the value for the radius");
			String radius = in8.nextLine();
			
			int r= Integer.valueOf(radius);
			
			Circle newcircle = new Circle(0,r);
			newcircle.getArea();
			newcircle.getPerimeter();
			
			Scanner in9 = new Scanner(System.in);
			System.out.println("Input the resizing factor");
			String factorC = in9.nextLine();
			
			int fc = Integer.valueOf(factorC);
			
			newcircle.resize(fc);
			newcircle.getArea();
			newcircle.getPerimeter();
			
			break;		
		//for right triangle
		case 3:
			Scanner in2 = new Scanner(System.in);
			System.out.println("Please enter the value for first leg");
			String firstleg = in2.nextLine();
			
			int leg1= Integer.valueOf(firstleg);
			
			Scanner in3 = new Scanner(System.in);
			System.out.println("Please enter the value for second leg");
			String secondleg = in3.nextLine();
			
			int leg2 = Integer.valueOf(secondleg);
			
			RtTriangle newtriangle = new RtTriangle(3, leg1, leg2);
			newtriangle.getArea();
			newtriangle.getPerimeter();
			
			Scanner in6 = new Scanner(System.in);
			System.out.println("Input the resizing factor");
			String factorT = in6.nextLine();
			
			int ft = Integer.valueOf(factorT);
			
			newtriangle.resize(ft);
			newtriangle.getArea();
			newtriangle.getPerimeter();						
				
			break;
		//for rectangle
		case 4:
			Scanner in4 = new Scanner(System.in);
			System.out.println("Please enter the value for width");
			String width = in4.nextLine();
			
			int w= Integer.valueOf(width);
			
			Scanner in5 = new Scanner(System.in);
			System.out.println("Please enter the value for length");
			String length = in5.nextLine();
			
			int l = Integer.valueOf(length);
			
			Rectangle newrectangle = new Rectangle(4,w,l);
			newrectangle.getArea();
			newrectangle.getPerimeter();
			
			Scanner in7 = new Scanner(System.in);
			System.out.println("Input the resizing factor");
			String factorR = in7.nextLine();
			
			int fr = Integer.valueOf(factorR);
			
			newrectangle.resize(fr);
			newrectangle.getArea();
			newrectangle.getPerimeter();
			
			break;	
		}
	
		System.out.println("The program is terminated");
	}

}
