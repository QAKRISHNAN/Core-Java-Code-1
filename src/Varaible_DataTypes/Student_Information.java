package Varaible_DataTypes;

import java.util.Scanner;

public class Student_Information {

	public static void main(String[] args) {
		
		//Static Way 
	
		byte sid=101;
		String Sname="Vamshi";
		char Section='A';
		float percentage=78.77f; //4bytes
		boolean Result=true;
		
	System.out.println("Student Information");
	
	System.out.println("Student ID: "+sid);
	System.out.println("Student Name: "+Sname);
	System.out.println("student Section: "+Section);
	System.out.println("Student Percentage: "+percentage);
	System.out.println("Student Result: "+Result);
		
		//Dynamic Way 
	/*Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter Student Information Here: ");
	
	System.out.println("Enter Student ID: ");	
	byte sid=scan.nextByte(); //101
	//short sid=scan.nextShort(); 
	
	System.out.println("Enter Student Name: ");	
	String Sname=scan.next();
	
	System.out.println("Enter Student Section: ");	
	char Section=scan.next().charAt(0);
	
	System.out.println("Enter Student Percenatge: ");	
	float percentage=scan.nextFloat();
	
	System.out.println("Enter Student Result: ");	
	boolean Result=scan.nextBoolean();	
		
		
	System.out.println("Student Information");
	
	System.out.println("Student ID: "+sid);
	System.out.println("Student Name: "+Sname);
	System.out.println("student Section: "+Section);
	System.out.println("Student Percentage: "+percentage);
	System.out.println("Student Result: "+Result);	
		
*/
		
	
		
		/*java.util.InputMismatchException: Value out of range. Value:"128"
		 * 
		 * 
		 */
		

	}

}
