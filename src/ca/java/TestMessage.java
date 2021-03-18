package ca.java;

import java.util.Scanner;

public class TestMessage {

	public static void main(String[] args) {

		Television tv = new Television();
		
		Person p = new Person();
		
		p.turnON(tv);
		
		Scanner scanner = new Scanner(System.in);
		scanner.nextInt();
	}

}
