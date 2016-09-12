package PracticeCode;
import java.util.Arrays;
import java.util.Scanner;

public class CodePractice7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Question 1
		
		String[] array = new String[10];
		System.out.println("Third position: " + array[2]); 
		
		//Question 2
		
		int[] arraynum = new int[5];
		System.out.println("First position: " + arraynum[0]);
		
		//Question 3
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number between 0 and 50");
		int arrayLength = sc.nextInt();
		float[] arrayFloat = new float[arrayLength];
		System.out.println("Length of the array: " + arrayFloat.length);
		
		//Question 4
		int[] fibonacci = new int[] {1,1,2,3,5,8,12};
		//Question 5
		System.out.println("Length of fibonacci array: " + fibonacci.length);
		//Question 6
		fibonacci[0] = 0;
		//Question 7
		fibonacci[6] = fibonacci[6] + 8;
		//Question 8
		char[] myLetters = new char[]{'a','b','c'};
		char[] yourLetters = myLetters;
		myLetters[0] = 'A';
		System.out.println("First Character: " + myLetters[0]);
		//Question 9
		yourLetters = new char[] {'x','y','z'};
		//Question 10
		char[] ourLetters = Arrays.copyOf(yourLetters,3);
		yourLetters[0] = 'X';
		System.out.println(ourLetters[0]);
		//Question 11
		int[] arrayadd = {1,2};
		try
		{
			arrayadd[2] = 3;
		}catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("You cannot add one more number to array");
		}
		
		//Question 12
		
		fibonacci = new int[] {1,1,2,3,5,8,12};
		int sum = 0;
		for(int i = 0 ; i < fibonacci.length; i ++){
			System.out.println(fibonacci[i]);
		}
		//Question 13
		for(int i = 0 ; i < fibonacci.length; i ++){
		sum += fibonacci[i];
		}
		System.out.println(sum);
		
		//Question 14
		for(int i : fibonacci){
			System.out.println(i);
		}
		
		//Question 15
		int sum1 = 0;
		for(int i : fibonacci){
			sum1 += i;
		}
		System.out.println(sum1);
		
		//Question 16
		String[] studentName = new String[] {"Sam","Roshan","Hasini","Reva","Hari"};
		System.out.println("Enter the student name");
		String name = sc.next();
		int index = -1;
		for(int i = 0; i < studentName.length; i++){
			if(studentName[i].equalsIgnoreCase(name)){
				index = i;
				break;
			}
		}
			if(index != -1){
				System.out.println(name + " found at index " + index);
			}else
			{
				System.out.println("Student not found");
			}
		
		
		sc.close();

	}

}
