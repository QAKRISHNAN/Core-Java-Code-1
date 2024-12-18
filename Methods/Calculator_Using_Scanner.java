package Methods;

import java.util.Scanner;

public class Calculator_Using_Scanner 
{
	
	static Scanner scan=new Scanner(System.in);
	
	static int a,b,c;
	
	public static void Addition()
	{
		
		c=a+b;
		System.out.println("Addition: "+ c);
	}
	
	public void Substraction()
	{
	
		 c=a-b;
		System.out.println("Substraction: "+ c);
	}
	
	public void Multification()
	{
	
		 c=a*b;
		System.out.println("Multification: "+ c);
	}
	
	
	public void Division()
	{
		
		 c=a/b;
		System.out.println("Division: "+ c);
		
	}
	
	public static void main(String[] args) 
	{
		System.out.print("Enter a,b Values: ");
		 a=scan.nextInt();
				 b=scan.nextInt();
		 
		
		Calculator_Using_Scanner obj=new Calculator_Using_Scanner();
		Calculator_Using_Scanner.Addition();
		obj.Substraction();
		obj.Multification();
		obj.Division();
		
	}
	
	
	/*
	public static  void Addition()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a,b Values: ");
		int a=scan.nextInt(),b=scan.nextInt();
		int c=a+b;
		System.out.println("Addition: "+ c);
	}
	
	public void Substraction()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a,b Values: ");
		int a=scan.nextInt(),b=scan.nextInt();
		int c=a-b;
		System.out.println("Substraction: "+ c);
	}
	
	public void Multification()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a,b Values: ");
		int a=scan.nextInt(),b=scan.nextInt();
		int c=a*b;
		System.out.println("Multification: "+ c);
	}
	
	
	public void Division()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a,b Values: ");
		int a=scan.nextInt(),b=scan.nextInt();
		int c=a/b;
		System.out.println("Division: "+ c);
		
	}
	
	public static void main(String[] args) 
	{
		Calculator_Using_Scanner obj=new Calculator_Using_Scanner();
		obj.Addition();
		obj.Substraction();
		obj.Multification();
		obj.Division();
		
	}
*/
}
