package ca.comit.java;

public class TestPersonArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArray = new int[5];
		
		Person personArray[] = new Person[5]; // array of Person class - store 5 objects of Person class;
		
		personArray[0] = new Person();
		
		personArray[1] = new Person("FirstIndexedPerson", "M");
		
		personArray[2] = new Person("AnotherPerson", "Female", "333 Broadway" , "Winnipeg", "MB", "R2X3X4");
		
		personArray[1].getName();
		
		personArray[2].getAddress().getAddressLine();
		

	}

}
