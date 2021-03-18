package ca.comit.java;

public class ObjectReferenceExample {

	public static void main(String[] args) {

		int number1, number2;
		number1 = 1;
		number2 = number1;
		
		//System.out.println("Number1=" + number1 + " and Number2=" + number2);
				
		number1 = 5;
		
		//System.out.println("Number1=" + number1 + " and Number2=" + number2);
		
		int[] intArray1, intArray2;
		
		intArray1 = new int[] {50, 100};
		
		intArray2 = intArray1;
		//System.out.println("intArray1[0]=" + intArray1[0] + " and intArray1[1]=" + intArray1[1]);
		//System.out.println("intArray2[0]=" + intArray2[0] + " and intArray2[1]=" + intArray2[1]);
		
		
		intArray1[1] = 10;
		//System.out.println("intArray1[1]=" + intArray1[1] + " and intArray2[1]=" + intArray2[1]);
		
		// Create String array of 5 elements and initialize the array elements.
		// Assign String array to another array. Change the value of the second array at 0 and 1 index.
		// And verify if the value in the first array is changed or not.
		
		String[] strArray1, strArray2;
		
		strArray1 = new String[] {"Hi", "Hello", "Hey", "Bye", "Hie"};
		
		strArray2 = strArray1;
		
		strArray2[0] = "New Value";
		
		strArray2[1] = "Something elese";
		
		//System.out.println("strArray1[0]=" + strArray1[0] + " and strArray2[0]=" + strArray2[0]);
		//System.out.println("strArray1[1]=" + strArray1[1] + " and strArray2[1]=" + strArray2[1]);
		
		String string1, string2;
		
		string1 = "Hello";
		string2 = string1;
		
		System.out.println("Comparison1 " + (string1 == string2) );
		System.out.println("Comparison1 " + string1.compareTo(string2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
