package Operators;

import java.util.Scanner;

public class IfCondition {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter Obtained Marks: ");
		int marks =scan.nextInt();
		
		if(marks>=35)
		{
			System.out.println("Result: Pass");
		}

		else
		{
			System.out.println("Result: Fail");
		}
		

	}

}
