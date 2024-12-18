package Varaible_DataTypes;

public class Types_Variables 
{
	static int b=20; //Static
	int c=30; //Non-Static

	
	
	public static void main(String[] args) {
		
		Types_Variables obj=new Types_Variables();
		int a=10; //Local Variable
		
		final int d=40; //Final / Constant
		//d=50;
		
		System.out.println("Local Variable: "+a);

		//Cal 
		
		System.out.println("Static Variable: "+(Types_Variables.b));

		System.out.println("Non-Static Variable: "+obj.c);
		
		System.out.println("Final Variable: "+d);
		
		
	}

}
