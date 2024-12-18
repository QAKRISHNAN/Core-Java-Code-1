package Looping;

import java.util.Scanner;

public class For_while_DoWhile {

	public static void main(String[] args) {
		// Known Loops
		// To Print 1 to 10 Numbers
		/*
		 * for(int i=1;i<=10;i++) //Normal { System.out.println("For Loop"); }//Exit
		 */
		/*
		 * Explanation: i=1; 1<=10 T i=2; 2<=10 T ------------ ------------ i=10;10<=10
		 * T i=11; 11<=10 F
		 */

		/*
		 * int i=1;
		 * 
		 * while(i<=10) { System.out.println(i); i++; }
		 */

		// To Print Even Numbers 2 to 100
		/*
		 * for(int i=2;i<=100;i+=2) //Normal += { System.out.println(i); }
		 */

		// i=i+2 i=2+2 i=4

		// To Print Even Numbers 1 to 100
		/*
		 * for(int i=1;i<=100;i+=2) //Normal += { System.out.println(i); }
		 */
		/*
		 * for(int i=5;i<=100;i+=5) //Normal += { System.out.println(i); }
		 */

		// i=i*5 i=5*5; i=25

		// Un-Known Loops
		/*
		 * for(;;) { System.out.println("Un-Known Loops"); }
		 */
		/*
		 * while(true) { System.out.println("Un-Known Loops"); }
		 */
		Scanner scan = new Scanner(System.in);
/*
		while (true) {
			
			System.out.println("Enter your Age: ");
			int age = scan.nextInt();

			if (age >= 18) // T T F
			{
				System.out.println("Enter your Weight: ");
				int weight = scan.nextInt();

				if (weight >= 25) // T F
				{
					System.out.println("You are Eligible to Donate Blood:");
				} else {
					System.out.println("You weight is Lessthan 25");
					System.out.println("You are not Eligible to Donate Blood:");
				}
			} else {
				System.out.println("You age is Lessthan 18");
				System.out.println("You are not Eligible to Donate Blood:");
			}
		}
		*/
		/*
		for(int i=1;i<=4;i++)
		{
			System.out.println("Enter your Age: ");
			int age = scan.nextInt();

			if (age >= 18) // T T F
			{
				System.out.println("Enter your Weight: ");
				int weight = scan.nextInt();

				if (weight >= 25) // T F
				{
					System.out.println("You are Eligible to Donate Blood:");
				} else {
					System.out.println("You weight is Lessthan 25");
					System.out.println("You are not Eligible to Donate Blood:");
				}
			} else {
				System.out.println("You age is Lessthan 18");
				System.out.println("You are not Eligible to Donate Blood:");
			}
		}
		*/
		while(true)
		{
		//int age=15;
		System.out.println("Enter your Age: ");
		int age=scan.nextInt();
		
		if(age>=18) //T F 20>=18
		{//TBS
			System.out.println("You are eligible to apply Vote");
			System.out.println("Congratulations...");
		}
		else
		{//FBS 
			System.out.println("You are not eligible to apply Vote");
			System.out.println("Try after few days...");
		}
		}

	}

}
