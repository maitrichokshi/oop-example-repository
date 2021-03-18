package ca.java;

public class Bicycle 
{
	
	// members of the Bicycle class - attributes, methods and constructors
	
	//define attributes
	private int speed;
	private int gear;
	protected int a;
	public static int counter;
	
	// Constructor overloading - when you have multiple constructors in the class - the number of parameters will be different in each constructor
	//constructor
	Bicycle()
	{
		speed = 0;
		gear = 1;
	}
	
	// parameterized constructor
	Bicycle(int speed, int gear)
	{
		this.speed = speed;
		this.gear = gear;
	}
	
	

	// method
	public void accelerate()
	{
		speed = speed + 5;
		counter = 5;
		
	}
	
	public void brake()
	{
		speed--;
		
	}
	
	public void upGear()
	{
		gear++;
		
	}
	
	public void downGear()
	{
		gear--;
		
	}
	
	public void printSpeed()
	{
		System.out.println("Speed = "+ speed);
	}

	@Override
	public String toString() {
		return "Bicycle [speed=" + speed + ", gear=" + gear + "]";
	}

	
	
}
