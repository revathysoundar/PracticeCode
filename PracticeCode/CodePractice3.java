package PracticeCode;

import java.util.Scanner;

public class CodePractice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Question 1
		
		for(int i = 0; i < 3; i++)
			System.out.println("Hello World!");
		
		//Question 2
		
		for(int i = 0; i < 10; i++)
			System.out.println(i);
		
		//Question 3
		for(int i = 1; i <= 10; i++)
			System.out.println(i);
		
		//Question 4
		for(int i = 10; i >= 1; i--)
			System.out.println(i);
		
		//Question 5
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		while(choice.equals("y"))
		{
			System.out.println("Do Something");
			System.out.println("Do you want to continue? enter y/n");
			 choice = sc.next();	
		}
		
		//Question 6
		
		System.out.println("Do something");
		
		
		String ch = "yes";
					
			while(true){
				
				System.out.println("Do you want to continue");
				 ch = sc.next();
				 if (ch.equalsIgnoreCase("yes"))
				 {
				System.out.println("Do something again");
				 }
				 else
				 {
					 break;
				 }
				
		}
			System.out.println("stop");
			
			sc.close();
		
		
	}

}
