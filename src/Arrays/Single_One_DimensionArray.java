package Arrays;

import Methods.*;
import java.util.Scanner;

public class Single_One_DimensionArray {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		// To Declare and Print Single_One_DimensionArray
		// Static
		/*
		 * int a[]={01,02,03,04,05}; //Static
		 * 
		 * for(int i=0;i<5;i++) //0<5 1<5 T 5<=5F {
		 * 
		 * //System.out.println(a[i]); //htno[0] htno[1] htno[5]
		 * 
		 * System.out.print(a[i]+"  ");
		 * 
		 * }
		 */

		// Dynamic Array
		// Memory Allocation
		// datatype arrayname=new datatype(size);

		int a[] = new int[5];

		System.out.println("Enter Array Elements: ");

		for (int i = 0; i < 5; i++) // 0<5 1<5 T 5<=5F
		{
			a[i] = scan.nextInt();
		}

		System.out.println("Given Array is: ");
		for (int i = 0; i < 5; i++) // 0<5 1<5 T 5<=5F
		{

			//System.out.println(a[i]); // htno[0] htno[1] htno[5]
			System.out.print(a[i]+"  ");
		}
		
		//WithReturType_WithParemeters.Div(2.5, 1.0);

	}

}
