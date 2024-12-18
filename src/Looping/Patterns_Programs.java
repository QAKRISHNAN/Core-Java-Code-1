package Looping;

public class Patterns_Programs 
{
	public static void main(String[] args) 
	{
	/*	1	2	3	4	5		1	1	1	1	1	
	 * 			
	 * 	1	2	3	4	5		2	2	2	2	2
	 * 
	 * 	1	2	3	4	5		3	3	3	3	3
	 * 
	 * 	1	2	3	4	5		4	4	4	4	4
	 * 
	 *  1	2	3	4	5		5	5	5	5	5
	 */

		/*
		for(int i=1;i<=100;i++) //Outer  T/F 
		{
			
			for(int j=1;j<=100;j++) //Inner  T/F 
			{
				//System.out.print(j+"  ");
				//System.out.print(i+"  ");
				
				System.out.print(" KRISH ");
			} //Exit
			
			System.out.println();
			
		}
		*/
		//Exit 
		
		/*Explanation:
		 * Outer-1:
		 *  i=1;i<=5;1<=5; T 
		 *  
		 *  Inner-1:
		 *  j=1;j<=5;1<=5 T 
		 *  j++;j=2;2<=5 T 
		 *  j++;j=3;3<=5 T
		 *  j++;j=4;4<=5 T
		 *  j++;j=5;5<=5 T
		 *  j++;j=6;6<=5 F
		 *  
		 *  Outer-2:
		 *  i++;i=2; 2<=5; T
		 *  Inner-2:
		 *  j=1;j<=5;1<=5 T 
		 *  j++;j=2;2<=5 T 
		 *  j++;j=3;3<=5 T
		 *  j++;j=4;4<=5 T
		 *  j++;j=5;5<=5 T
		 *  j++;j=6;6<=5 F
		 *  
		 *  Outer-3:
		 *  i++;i=3; 3<=5; T
		 *  
		 *  Inner-3:
		 *  j=1;j<=5;1<=5 T 
		 *  j++;j=2;2<=5 T 
		 *  j++;j=3;3<=5 T
		 *  j++;j=4;4<=5 T
		 *  j++;j=5;5<=5 T
		 *  j++;j=6;6<=5 F
		 *  ----------------
		 *  ---------------
		 * Outer-6:
		 *  i++;i=6; 6<=5; F
		 *  
		 *  1   2   3  4  5 
		 *  
		 *  1	2	3	4	5
		 *  
		 *  1	2	3	4	5
		 *   
		 */
			
		/*
		System.out.println("1	2	3	4	5");
		System.out.println("1	2	3	4	5");
		System.out.println("1	2	3	4	5");
		System.out.println("1	2	3	4	5");
		System.out.println("1	2	3	4	5");
		*/

		/*	1						*
		 * 	1	2					*	*
		 * 	1	2	3				*	*	*
		 * 	1	2	3	4			*	*	*	*
		 * 	1	2	3	4	5		*	*	*	*	*
		 * 
		 */
		
		for(int i=1;i<=5;i++) //Outer  T/F 
		{
			
			for(int j=1;j<=i;j++) //Inner  T/F 
			{
				//System.out.print(j+"  ");
				//System.out.print(i+"  ");
				
			System.out.print(" KRISH ");
			} //Exit
			
			System.out.println();
			
		}
	}

}
