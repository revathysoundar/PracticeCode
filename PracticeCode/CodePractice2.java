package PracticeCode;

import java.util.Scanner;

public class CodePractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int altitude = 50;
		boolean isOcean = altitude <= 0;   // less than or equal to 0
		boolean isMountains = altitude > 3000;   // above 3000
		boolean isBeach = (altitude == 0); // is exactly 0
		boolean isLowland = (altitude > 0 && altitude < 1000); // above 0 but less than 1000
		boolean isDeep = (altitude < -50); // less than -50
		boolean isNotEverest = altitude != 29029; // is not 29029

		System.out.println("is ocean:       " + isOcean);
		System.out.println("is mountains:   " + isMountains);
		System.out.println("is beach:       " + isBeach);
		System.out.println("is lowland:     " + isLowland);
		System.out.println("is deep:        " + isDeep);
		System.out.println("is NOT everest: " + isNotEverest);

		//Question 2
		
		System.out.println("Enter a nunber");
		int number = sc.nextInt();
		if(number % 2 == 0 )
		{
			System.out.println("Even Number: "+ number);
		}
		else
		{
			System.out.println("Odd Number: " + number);
		}
		
		
		//Question 3
		
		System.out.println("If you want to know a secret enter yes/no");
		String choice = sc.next();
		if(choice.equalsIgnoreCase("yes")){
			System.out.println("Anyone can be a developer");
		}
		else
		{
			System.out.println("Ok we'll keep our secret");
		}
	
		//Question 4
		
		System.out.println("Enter number between 1 and 3");
		int choiceNumber = sc.nextInt();
		switch(choiceNumber)
		{
		case 1: System.out.println("You entered One");break;
		case 2: System.out.println("You entered Two");break;
		case 3: System.out.println("You entered Three");break;
		default:System.out.println("Sorry i don't know that number");
		}
		
		//Question 5
		System.out.println("Enter Angle in Degrees");
		int degrees = sc.nextInt();
		if (degrees < 90)
			System.out.println("Acute angle");
		
		else if (degrees == 90)
			System.out.println("Right angle");
		else if (degrees > 90)
			System.out.println("Obtuse angle");
		else if(degrees > 180)
			System.out.println("N/A");
		
		//Question 6
		
		System.out.println("Enter a numberr");
		int num = sc.nextInt();
		if (num < 100)
		{
			num = (num + 20);
			
		}
		else
			num *= 5;
		System.out.println("number: " + num);
	
	sc.close();
	
	
	
	
	}
	
	

}
