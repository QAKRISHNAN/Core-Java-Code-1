package Operators;

import java.util.Scanner;

public class Ternary_Operators {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//int marks=50;
		//int marks=30;
		
		System.out.println("Enter Obtained Marks: ");
		int marks =scan.nextInt();
		
		boolean result=marks>=45?true:false;
		//30>=35 

		System.out.println("Result: "+result);
		

	}

}
