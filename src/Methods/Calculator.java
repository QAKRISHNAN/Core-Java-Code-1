package Methods;

public class Calculator 
{
//Inside Class and OutSide MainMethod:Global[Re-Use]
	
	//Accessspecifier ReturnType MethodName(Paremeters_List)
	
	//Method-1
	public void Addition() //Declaration 
	{
		//Without ReturnType and Without Parameters
		
		int a=10,b=20;
		int c=a+b;
		System.out.println("Additon:" + c);
	}
	
	
	
	//Method-2 Non-Static Object
	private  void Substraction() //Declaration 
	{
		int a=10,b=20;
		int c=a-b;
		System.out.println("Substraction:" + c);
	}
	//Method-3 Static Class 
	
	protected static void Multification() //Declaration 
	{
		int a=10,b=20;
		int c=a*b;
		System.out.println("Multification:" + c);
	}
	
	 void Division() //Declaration 
	{
		int a=10,b=20;
		int c=a*b;
		System.out.println("Multification:" + c);
	}
	
	//Inside Package Inside Class
	
	public static void main(String[] args)  //Main Method
	{
		//Cal Object 
		//Inside/Same Package OutSide Class
	
		Calculator cal=new Calculator();
		
		cal.Addition(); //Non-Static Object
		cal.Substraction();
		
		Calculator.Multification(); //Static 
		
		Calculator1.Division(); //Re-Use 
		
		//cal.Multification(); //warning
		//The static method Multification() from the type Calculator should be accessed in a static way
		//Cannot make a static reference to the non-static method Substraction() from the type Calculator
		
		
	}
	
	
}
