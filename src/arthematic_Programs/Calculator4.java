package arthematic_Programs;

import Methods.Calculator;
import Methods.Calculator1;

public class Calculator4 
{

	public static void main(String[] args) 
	{
		//OutSide Package OutSide Class 
		
		Calculator cal=new Calculator();
		cal.Addition();
		cal.Substraction();
		cal.Multification();
		Calculator1.Division();
		
		//The method Multification() from the type Calculator is not visible
		

	}

}
