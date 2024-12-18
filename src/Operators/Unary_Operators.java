package Operators;

import java.util.Scanner;

public class Unary_Operators {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		/*
		int a=5,b=5,c=5,d=5;
		
		//Pre-Increment:
		System.out.println("Pre-Increment: "+ (++a)); //6
		System.out.println("Hold: "+a);
		
		//Post-Increment:
		System.out.println("Post-Increment: "+b++); //4
		System.out.println("Hold: "+b);
		
		//Pre-Decrement:
		System.out.println("Pre-Decrement: "+ (--c));        //4
		System.out.println("Hold: "+c); //4
		
		//Post-Decrement:
		System.out.println("Post-Decrement: "+d--); 		//5
		System.out.println("Hold: "+d);	//4 
		*/
		
		System.out.println("Enter any Number: ");
		int x=scan.nextInt(); //10  Normal Variable 
		

		//Pre-Increment:
		System.out.println("Pre-Increment: "+ (++x)); //11
		System.out.println("Hold: "+x); 			  //11
		
		//Post-Increment:
		System.out.println("Post-Increment: "+x++); // 11
		System.out.println("Hold: "+x);				// 12
		
		//Pre-Decrement:
		System.out.println("Pre-Decrement: "+ (--x)); //11 
		System.out.println("Hold: "+x); 			  //11 
		
		//Post-Decrement:
		System.out.println("Post-Decrement: "+x--);   //11 
		System.out.println("Hold: "+x);				  //10   
	}
	/*
	 * Enter any Number: 
10
Pre-Increment: 11
Hold: 11
Post-Increment: 11
Hold: 12
Pre-Decrement: 11
Hold: 11
Post-Decrement: 11
Hold: 10

	 */

}
