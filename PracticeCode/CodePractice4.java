package PracticeCode;

import java.util.Scanner;

public class CodePractice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Question 1
		sayHello();
		sayHello();
			
		//Question 2
		System.out.println("Enter your name");
		String name = sc.next();
		greet(name);
		
		//Question 3
		int five = 5;
		int eight = 8;
		int result = calculateSquare(five);
		int result1 = calculateSquare(eight);
		System.out.println("Square of five: "+result);
		System.out.println("Square of eight: "+result1);
		
		//Question 4
		printNTimes("Huzzah",4);
		
		//Question 5
		int addInt = combine(5, 5);
		double addDouble = combine(5.3, 5.3);
		String addString = combine("hello", "world");
		System.out.println("Integer: " + addInt);
		System.out.println("Double: " + addDouble);
		System.out.println("String: " + addString);
		
		sc.close();
	}
	public static  void sayHello()
	{
		System.out.println("Hello World");
	}
	public static void greet(String name)
	{
		System.out.println("Hello " + name);
	}
	public static int calculateSquare(int number)
	{
		return number * number;
	}
	public static void printNTimes(String stringValue, int noOfTimes)
	{
		for(int i = 0; i < noOfTimes; i++)
		{
			System.out.println(stringValue);
		}
	}
	public static int combine(int a, int b)
	{
		return a + b;
	}
	public static double combine(double a, double b)
	{
		return a + b;
	}

	public static String combine(String a, String b)
	{
		return a + " " + b;
	}

}
