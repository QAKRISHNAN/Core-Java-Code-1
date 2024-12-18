package CoditionalStatements;

import java.util.Scanner;

public class If_Else {

	public static void main(String[] args) 
	{
		/* Student Result 
		 * Enter Student Marks:50
		 * marks>=35 Pass / Fail 
		 */
	//int marks=30;	
		
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter Student Marks");
	int marks=scan.nextInt();		
	
		if(marks>=35) //true 50>=35 true  30>=35 false
		{
			System.out.println("Pass");  //TBS 
		}
		else
		{
			System.out.println("Fail");
		}
	}

}
