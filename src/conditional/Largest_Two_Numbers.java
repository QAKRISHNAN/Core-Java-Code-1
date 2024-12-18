package conditional;

import java.util.Scanner;

public class Largest_Two_Numbers {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
			
		
		System.out.println("Enter any two Integers: ");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
				
		if(num1>num2) //10>20 F 100>20T 8>2 
		{//TBS
			//System.out.println("Num1[First Number] is Big: ");
			System.out.println(num1 + ">"+num2 +": First Number is Big");
		}
		else
		{//FBS 
			//System.out.println("Num2[Second Number] is Big:");
			System.out.println(num1 + "!>="+num2 +": Second Number is Big");

		}
		/*
			
		//int num1=10,num2=20;
		int num1=12,num2=55;
		
		if(num1>num2) //10>20 F 100>20T 8>2 
		{//TBS
			//System.out.println("Num1[First Number] is Big: ");
			System.out.println(num1 + ">"+num2 +": First Number is Big");
		}
		else
		{//FBS 
			//System.out.println("Num2[Second Number] is Big:");
			System.out.println(num1 + "!>="+num2 +": Second Number is Big");

		}*/

	}

}
