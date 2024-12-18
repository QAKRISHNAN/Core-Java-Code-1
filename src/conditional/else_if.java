package conditional;

import java.util.Scanner;

public class else_if {

	public static void main(String[] args) {
		// Student Grades
		
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter Student Marks Here:  ");
	int marks=scan.nextInt(); //10
	
	if(marks>=80 && marks<=100)//A 90>=80 T 80>=80 85
	{ //true && true = true 
		System.out.println("A Grade");
		
	}
	else if(marks>=75 && marks<80)//A 155>=75
	{
		System.out.println("B Grade");
		
	}
	else if(marks>=55 && marks<75)//A 
	{
		System.out.println("C Grade");
		
	}
	else if(marks>=35 && marks<55)//A 
	{
		System.out.println("D Garde");
		
	}
	else if(marks>=0 && marks<35)//A 
	{
		System.out.println("Fail");
		
	}
	else 
	{
		System.out.println("Inavlid Marks ");
		
	}
	

	}

}
