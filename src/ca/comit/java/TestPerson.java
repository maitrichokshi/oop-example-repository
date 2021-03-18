package ca.comit.java;

public class TestPerson {

	public static void main(String[] args) {

		Person person1 = new Person();
		
		person1.setName("TestPerson");
		
		System.out.println("Name = " + person1.getName());
		
		Person person2 = new Person("AnotherPerson", "Female", "333 Broadway" , "Winnipeg", "MB", "R2X3X4");
		
		System.out.println("Person2's name" + person2.getName());
		
		System.out.println("Person2's addressline" + person2.getAddress().getAddressLine());
		
		
	}

}
