package PracticeCode;

import java.util.Scanner;

public class CodePractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		byte number = 19;  // Question 1
		short smallInt = 100 - 24;  // Question 2
		int courtArea = 78 * 27;  //  Question 3
		long circumference = 24901 * 5280; // Question 4
		float circumferenceOfCircle = (float) (2 * 3.1415 * 18); // Question 5;
		double time = (149.6 / 299792458.0)/60.0 ; // Question 6
		char letter = 'M';// Question 7
		double minutesToEarth = 149600000000.0 / 299792458.0 / 60.0;
		
		// Question 8
		
		char nextCharacter = (char)(letter + 5); 
		
		// Question 9
		boolean choice = true;
		
		//// Question 10
		int age;
		age = 36;
		age = age + 1;
		System.out.println("Age: " + age);
		
		//// Question 11
		System.out.println("Enter your name?");
		String name = sc.next();
		System.out.println("Hello " + name + "!");
		
		/// Question 12
		
		System.out.println("Enter number between 1 and 10");
		int storeNumber = sc.nextInt();
		
		System.out.println("number: " + number);
		System.out.println("smallInt: " + smallInt);
		System.out.println("courtArea: " + courtArea);
		System.out.println("circumference: " + circumference);
		System.out.println("circumferenceOfCircle: " + circumferenceOfCircle);
		System.out.println("time: " + time);
		System.out.println("letter: " + letter);
		System.out.println("nextcharacter: " + nextCharacter);
		System.out.println("choice: " + choice);
		System.out.println("Age: " + age);
		System.out.println("storeNumber: " + storeNumber);
		System.out.println(minutesToEarth);
		
		sc.close();
		
		
		
		
		
		
		
		
		

	}

}
