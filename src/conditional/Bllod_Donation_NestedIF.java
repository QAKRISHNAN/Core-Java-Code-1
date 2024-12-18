package conditional;

import java.util.Scanner;

public class Bllod_Donation_NestedIF {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter your Age: ");
		int age=scan.nextInt();
				
		if(age>=18) //T T F 
		{
			System.out.println("Enter your Weight: ");
			int weight=scan.nextInt();
			
			if(weight>=25) //T F
			{
				System.out.println("You are Eligible to Donate Blood:");
			}
			else
			{
				System.out.println("You weight is Lessthan 25");
				System.out.println("You are not Eligible to Donate Blood:");
			}
		}
		else
		{
			System.out.println("You age is Lessthan 18");
			System.out.println("You are not Eligible to Donate Blood:");
		}
		
		/*
		System.out.println("Enter your Age: ");
		int age=scan.nextInt();
		
		System.out.println("Enter your Weight: ");
		int weight=scan.nextInt();
		
		if(age>=18) //T T F 
		{
			if(weight>=25) //T F
			{
				System.out.println("You are Eligible to Donate Blood:");
			}
			else
			{
				System.out.println("You weight is Lessthan 25");
				System.out.println("You are not Eligible to Donate Blood:");
			}
		}
		else
		{
			System.out.println("You age is Lessthan 18");
			System.out.println("You are not Eligible to Donate Blood:");
		}
		*/

	}

}
