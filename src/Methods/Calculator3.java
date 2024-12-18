package Methods;

public class Calculator3 
{

	public static void main(String[] args) 
	{
		//Same Package and Different/Outside Class
		
		Calculator cal3=new Calculator();
		
		cal3.Addition();
		cal3.Substraction();
		
		cal3.Multification();
		
		Calculator1.Division();
		
		//The method Substraction() from the type Calculator is not visible

	}

}
