package ca.comit.java;

public class TestBicycle {

	public static void main(String[] args) {

		Bicycle myBicycle = new Bicycle(); //creating object - myBicycle- of Bicycle class
		Bicycle myBicycle1 = new Bicycle(); //
		
		
		myBicycle.printSpeed();
		myBicycle.accelerate(); // invoking method of Bicycle class
		myBicycle.printSpeed();
				
		
		Bicycle hisBicycle = new Bicycle(5, 2); // invoking the parameterized constructor
		hisBicycle.accelerate();
		hisBicycle.upGear();
		
		System.out.println(hisBicycle);
		
	}
	
	// Create a class Circle with attribute radius and method to calculate the area of the circle and print the area.
	// Create a class TestCircle to create the instance of the Circle class and invoke its method.
	
	// Create a class Employee with attributes employeeid, firstname, lastname, desgination. 
	// Create a parameterized constructor for object initialization. Add a method to print the values of the attributes (as we used printSpeed in Bicycle class)
	// Create a class TestEmployee to create 2 instances of the Employee class and invoke its method to print the attribute values.

}
