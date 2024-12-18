package conditional;

import java.util.Scanner;

public class Simple_IF {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		//Eligible to Apply Vote or not 
		
		//int age=15;
		System.out.println("Enter your Age: ");
		int age=scan.nextInt();
		
		if(age>=18) //T F 20>=18
		{
			System.out.println("You are eligible to apply Vote");
			System.out.println("Congratulations...");
		}
		//Exit

	}

}
