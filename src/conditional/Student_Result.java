package conditional;

import java.util.Scanner;

public class Student_Result {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
			
		
		System.out.println("Enter your Marks: ");
		int marks=scan.nextInt();
		/*
		if(marks>=0 && marks<=100) //
		{//TBS
		if(marks>=35)
		{
			System.out.println("Pass");
		}
		else
		{//FBS 
			
			System.out.println("Fail");
		}
		}
		else
		{
			System.out.println("Invalid Marks");
		}
		*/
			
		if(marks>=35) //10>20 F 100>20T 8>2 
		{//TBS
			
			System.out.println("Pass");
		}
		else
		{//FBS 
			
			System.out.println("Fail");

		}
		
		
	}

}
