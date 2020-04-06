package com.company;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Car car1 = new PerformanceCar("BMW", "Germany", "black", "Petrol", 2019, 4, 40000, 2, "Manual", "Excellent");
	Car truck1 = new Truck("Ford", "USA", "white", "Diesel", 2019, 4, 30000, 5);
	
	car1.engineStart();
	car1.acceleration();
	car1.brake();
	car1.wiper();
	
	truck1.engineStart();
	truck1.acceleration();
	truck1.brake();			
		
	}

}
/*INHERITENCE: I have created a parent class called Car and two sub-classes (child class) called PerformanceCar and Truck. In those
 * sub-classes I used the keyword Extends. This meant those sub-classes will now inherit the attributes and methods of 
 * the parent class. When writing the constructor, I added keyword super.
 */

/*POLYMORPHISM: In those sub-classes, I have overridden some methods which are case specific.
 */ 
