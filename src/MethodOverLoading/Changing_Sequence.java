package MethodOverLoading;

public class Changing_Sequence 
{

	public void details(String name, char rank) 
	{
		System.out.println("Employee name is "+name +"\t Employee Rank is "+ rank);
		
		} 
	//Method Overloading on sequence of parameters
		public void details(char rank, String name) 
		{
			System.out.println("Employee Rank is "+ rank +"\t Employee name is "+name );
			
		}
		
		public static void main(String[] args) 
		{ 
			Changing_Sequence emp = new Changing_Sequence(); //Object
		
		emp.details("Rajesh", 'A'); // calls the first method (details(String, char))
		emp.details('B', "Ram" ); //calls the second method (details(char, String)) } }
}
}
