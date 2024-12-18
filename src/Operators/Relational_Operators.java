package Operators;

import java.util.Scanner;

public class Relational_Operators {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		// int a=10,b=5; //Static 
		
	 System.out.println("Enter any Two Values: ");
		//int a=scan.nextInt(),b=scan.nextInt();
	float a=scan.nextFloat(),b=scan.nextFloat();
	
	  System.out.println(a<b); // 10<5 false 
	  System.out.println(a<=b); // 10<=5 false 
	  
	  System.out.println(a>b); // true
	  System.out.println(a>=b); // true
	  
	  System.out.println(a==b); //false
	  System.out.println(a!=b); //true
	
	
	

	}

}
