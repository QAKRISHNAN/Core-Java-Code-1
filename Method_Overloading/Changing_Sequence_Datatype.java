package Method_Overloading;

public class Changing_Sequence_Datatype 
{
	void details(String name, char rank)  // method details having 2 parameters
	{
	System.out.println("Employee name is "+name);
	System.out.println("Employee ranking is "+rank);
	}  //Method Overloading on sequence of parameters
	void details(char rank, String name)     // method details overloaded
	{
	System.out.println("Employee ranking is "+rank);
	System.out.println("Employee name is "+name);
	
	}
		
	public static void main(String[] args)
	{  Changing_Sequence_Datatype emp = new Changing_Sequence_Datatype();
	emp.details("Rajesh", 'A');  // calls the first method (details(String, char))
	emp.details('B', "Ram" );    //  calls the second method (details(char, String))
	
	}
}
