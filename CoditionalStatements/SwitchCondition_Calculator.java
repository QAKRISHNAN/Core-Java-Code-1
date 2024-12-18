package CoditionalStatements;

import java.util.Scanner;

public class SwitchCondition_Calculator {

	public static void main(String[] args) 
	{
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter any Two Values");
	int a=scan.nextInt();  //Global 
	int b=scan.nextInt();
	int c;
	
	System.out.println("CALCULATOR");
	System.out.println("1.ADDITION");
	System.out.println("2.SUBSTRACTION");
	System.out.println("3.MULTIFICATION");
	System.out.println("4.DIVISION");
	System.out.println("5.MODULO DIVISION");
	
	System.out.println("Enter your Choice: ");
	int ch=scan.nextInt();
	
	switch(ch)
	{
	case 1:
	{
		 c=a+b;  //Local 
		System.out.println("Addition is: "+ c );
		break;
	}
	case 2:
	{	
		  c=a-b;
		System.out.println("Substraction is: "+ c);
		break;
	}	
	
	case 3:
	{
		  c =a*b;
		System.out.println("Multplication is: "+ c);
		break;
	}
	case 4:
	{
		 c=a/b;
		System.out.println("Division is: "+ c);
		break;
	}
	case 5:
	{
		 c=a%b;
		System.out.println("Modulo Division is: "+ c);
		break;
	
	}
	default:
	{
		System.out.println("Only 1 to 5 ");
	}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	switch(ch)
	{
	case 1:
	{
		int c=a+b;
		System.out.println("Addition is: "+ c );
		break;
	}
	case 2:
	{
		int c=a-b;
		System.out.println("Substraction is: "+ c);
		
	}
	case 3:
	{
		int c=a*b;
		System.out.println("Multplication is: "+ c);
		break;
	}
	case 4:
	{
		int c=a/b;
		System.out.println("Division is: "+ c);
		break;
	}
	case 5:
	{
		int c=a%b;
		System.out.println("Modulo Division is: "+ c);
		break;
	}
	
	default:
	{
		System.out.println("Only 1 to 5 ");
	}
	
	}*/
	
	}

}
