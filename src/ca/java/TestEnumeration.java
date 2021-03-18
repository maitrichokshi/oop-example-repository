package ca.java;

public class TestEnumeration {

	public static void main(String[] args) {
		
		Vessel ves = Vessel.JUG;
		
		ves.getCC();
		
		System.out.println("Jug Capacity" + ves.getCC());
		
		System.out.println("Coffeecup Capacity" + Vessel.COFFEECUP.getCC());
		
	}

}
