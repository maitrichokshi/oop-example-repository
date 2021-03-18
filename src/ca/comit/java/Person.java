package ca.comit.java;

public class Person {
	
	private String name;
	private String gender;
	private Address address;
	
	
	 public Person(String name, String gender) { 
		 //super(); 
		 this.name = name;
		 this.gender = gender;
	  
	 }
	 
	
	public Person(String name, String gender, String addressLine, String city, String province, String postalCode) 
	{
		//super();
		this.name = name;
		this.gender = gender;
		address = new Address(addressLine, city, province, postalCode);
		
	}

	public Person() {
		System.out.println("This is my no-parameter constructor, no attributes will be initialized.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	

}
