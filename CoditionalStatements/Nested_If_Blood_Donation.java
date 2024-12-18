package CoditionalStatements;

import java.util.Scanner;

public class Nested_If_Blood_Donation {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter Your Age: ");
		int age=scan.nextInt();
		
		System.out.println("Enter Your Weight: ");
		int weight=scan.nextInt();
		
		if(age>=18) //true false Outer
		{
			if(weight>=40)  //true false Inner
			{
				System.out.println("Eligible to Donate Blood");
			}
			else //Inner Condition Else Block
			{
				System.out.println("Your Weight is <40, Not Eligible");
				
			}
		}
			else  //Outer Condition Else Block
			{
				System.out.println("Your Age is <18, Not Eligible");
			}
			
	
		
	}

}
