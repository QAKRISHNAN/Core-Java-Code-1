package Constructors;

public class Sample_Constructors //Class Name
{
	//Constructor
public Sample_Constructors() //Non-Static Method Name 
{
	System.out.println("I am Constructor");
}
	//Method 

public void  Method() //Non-Static Method Name 
{
	System.out.println("I am Method");
}

public static void main(String[] args) 
{
	Sample_Constructors con=new Sample_Constructors();
	con.Method();
	
}
}
