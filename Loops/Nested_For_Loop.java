package Loops;

public class Nested_For_Loop 
{
		public static void main(String[] args)
	{
		/*Print the below Number pattern
		 	1 		//OUTER LOOP
	     	1 2 3 4  //INNER LOOP
	     	2		//OUTER LOOP
	     	1 2 3 4  //INNER LOOP
	     	3		//OUTER LOOP
	     	1 2 3 4	//INNER LOOP
			 */
			
		// Outer for loop.
	/*  for(int i = 1; i <= 3; i++)//True 1<=3 2<=3 true
	  {
		  System.out.print(i+"  "); // will execute 3 times.
		 System.out.println(" ");
	   
	 // Inner for loop.
	    for(int j = 1; j <= 4; j++)//1<=4 2<=4 3<=4 4<=4  True 5<=4 false
	    {
	    	
	      System.out.print( j+"  "); // will execute 12 (3 * 4) times.
	    }
	    System.out.println(" ");
	   }	*/
			
			
		 /*Print the below Number pattern
			   1   2   3   4   5      
			   1   2   3   4   5      
			   1   2   3   4   5      
			   1   2   3   4   5      
			   1   2   3   4   5    */  
		
	/*	 int i,j; 
		 for(j=1;j<=5;j++)
		 {
			 for(i=1;i<=j;i++) //1<=3 2<=3 3<=3F   1 
		{									       1 2	
		 System.out.print(i+ "  ");                 
		 } 
			 System.out.println( "   "); 
			 } */
	//*******************************************
			/*Print the below pattern
			   5   4   3   2   1      
			   5   4   3   2   1      
			   5   4   3   2   1      
			   5   4   3   2   1      
			   5   4   3   2   1   */   

	/* int i,j; 
		 for(i=5;i>=1;i--)
		 { 
		for(j=5;j>=1;j--)
		 { 
			 System.out.print("   "+j);
		 } 
		 System.out.println( "      " ); 
		 }	
			*/
	//***************************************	
			/*Print the below pattern
			   1      
			   1   2      
			   1   2   3      
			   1   2   3   4      
			   1   2   3   4   5 
			   
			 	*        
			 	*    *        
			 	*    *    *        
			 	*    *    *    *        
			 	*    *    *    *    *    
			   
			    */
			
			
		/*	int i,j;
			
			 for(j=1;j<=5;j++)  // 1<=5 T j=2 2<=5 T
			 { 
			for(i=1;i<=j;i++)//1<=2 True 2<=2 3<=2 False
			 { 
				 System.out.print(j+"    ");
			 } 
			 System.out.println( "      " ); 
			 }
		
		*/
	//*********************************************
			/*Print the below pattern
			   5   5   5   5   5      
			   4   4   4   4      
			   3   3   3      
			   2   2      
			   1      */

	/*		int i,j; 
			 for(j=5;j>=1;j--) //5>=1 4>=1
			 { 
			for(i=1;i<=j;i++)//1<=0
			 { 
				 System.out.print(j+"   ");
			 } 
			 System.out.println( "      " ); 
			 }	*/	
	//-----------------------------------------------------
			/*Print the below pattern
			 	1   2   3   4   5      
	   			1   2   3   4      
	   			1   2   3      
	   			1   2      
	   			1      			*/

		/*	 int i,j; 
			 for(j=5;j>=1;--j)
			 { 
			for(i=1;i<=j;++i)//2<==1
			 { 
				 System.out.print(" A  ");
			 } 
			 System.out.println( "      " ); 
			 }
			 			*/	
	//-----------------------------------------------------
			 
			 /*Print the below pattern
			   1      
			   2   2      
			   3   3   3      
			   4   4   4   4      
			   5   5   5   5   5  */  
			    
	/*	 	int i,j; 
			 for(j=1;j<=5;j++)
			 { 
			for(i=1;i<=j;i++)
			 { 
				 System.out.print("   "+j);
			 } 
			 System.out.println( "      " ); 
			 }
			 */
	//****************************************
	 
	 
	 
			 
		 /*Print below Number pattern
		 	1 
			2 3 
			4 5 6 
			7 8 9 10 
			11 12 13 14 15 */

		/*	int i, j, k = 1;
	           for (i = 1; i <= 5; i++) //6<=5 False
	           {
	               for (j = 1; j< i + 1; j++) //1<6
	               {
	       //1<2 True 2<2  1<3 
	                    System.out.print("  "+ k++);
	            	  
	                }
	       
	                System.out.println();
	            }	*/
			/*Print below Alphabets	
			A 
			A B 
			A B C 
			A B C D 
			A B C D E 
			A B C D E F */
		
			
	/*		int alphabet = 65;
	        for (int i = 0; i <= 6; i++)
	{
	    for (int j = 0; j <= i; j++)
	    {
	        System.out.print((char) (alphabet + j) + "   ");
	        //Explicit Type Conversion (Narrowing):
	    }
	    
	    System.out.println(" ");
	}	
	 */
	  //Display tables for 1 and 2 using nested for loops.
	  	/*		1 * 1 = 1
			    1 * 2 = 2
			    1 * 3 = 3
			    1 * 4 = 4
			    1 * 5 = 5
			    1 * 6 = 6
			    1 * 7 = 7
			    1 * 8 = 8
			    1 * 9 = 9
			    1 * 10 = 10

			    2 * 1 = 2
			    2 * 2 = 4
			    2 * 3 = 6
			    2 * 4 = 8
			    2 * 5 = 10
			    2 * 6 = 12
			    2 * 7 = 14
			    2 * 8 = 16
			    2 * 9 = 18
			    2 * 10 = 20		*/
	  
	  System.out.println("Displaying Tables: ");	

	 for(int i = 5; i <= 5; i++) //1<=2 2<=2 3<=2true
	 {

	  for(int j = 1; j <= 10; j++) //1<=5 2<=5 3<=5 6<=10 7<=10 11<=10
	  {
	    System.out.println(i+ " * " +j+" = "+ (i*j));
	   }
	  System.out.println(" ");
	 } 

	        //***************************************	
			/*Print the below pattern
			    *        
			    *   *        
			    *   *   *        
			    *   *   *   *        
			    *   *   *   *   *        
			    *   *   *   *   *   *   */
			
		/*	int i,j; 
			 for(j=1;j<=6;j++)
			 { 
			for(i=1;i<=j;i++)//2<==1
			 { 
				 System.out.print(" * ");
			 } 
			 System.out.println( "      " ); 
			 }		*/
			 
	/*Print the below pattern
	  		 *   *   *   *   *   *        
			 *   *   *   *   *        
			 *   *   *   *        
			 *   *   *        
			 *   *        
			 *        */

		/*	 int i,j; 
			 for(j=6;j>=1;j--)
			 { 
			for(i=1;i<=j;i++)//2<==1
			 { 
				 System.out.print(" *  ");
			 } 
			 System.out.println( "      " ); 
			 }		*/
			 
			 		 
		}

	}

	

