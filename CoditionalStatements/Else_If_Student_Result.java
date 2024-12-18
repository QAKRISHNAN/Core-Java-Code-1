package CoditionalStatements;

import java.util.Scanner;

public class Else_If_Student_Result {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter Student Marks");
		int marks=scan.nextInt();
		
	if(marks<=100 && marks>=80)  //90>=80  100 to 80 
	{
		System.out.println("Distinction");
	}
	else if(marks<80 && marks>=60)  //101>60
	{
		System.out.println("First Class");
	}
	else if(marks<60 && marks>=45)
	{
		System.out.println("Second Class");
	}
	else if(marks<45 && marks>=35)
	{
		System.out.println("Pass");
	}
	else if(marks<35 && marks>=0)
	{
		System.out.println("Fail");
	}
	
	else
	{
		System.out.println("Enter Only 0 to 100");
	}

	}

}
