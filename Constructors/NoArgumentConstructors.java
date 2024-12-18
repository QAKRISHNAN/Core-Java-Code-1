package Constructors;

public class NoArgumentConstructors 
{
	//String name;

		// public constructor
		public	NoArgumentConstructors()  //No-Argument or No-Parameterized Constructor
		{
			String	name="Tronix";
			int a=10;
			float percentage=99.99f;
			System.out.println(name);
			System.out.println(a);
			System.out.println(percentage);
		}

	public static void main(String[] args)
		{
		// object is created in another class
			NoArgumentConstructors obj = new NoArgumentConstructors();
			
		}
}
