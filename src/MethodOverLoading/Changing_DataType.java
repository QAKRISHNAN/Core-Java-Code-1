package MethodOverLoading;

public class Changing_DataType 
{
	public int sum(int a, int b) 
	{
		return a + b; 
		}
		public double sum(double a, double b) 
		{
		return a + b; 
		}
		public static void main(String[] args)
		{
			Changing_DataType ex = new Changing_DataType(); //Object
		
			int result1 = ex.sum(2, 3);
		double result2 = ex.sum(2.5, 3.5);
		System.out.println("Result1: " + result1);
		//System.out.println("Result1: " + ex.sum(2, 3));
		System.out.println("Result2: " + result2);
		
		} 
		}


