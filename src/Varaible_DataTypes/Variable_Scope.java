package Varaible_DataTypes;

public class Variable_Scope {


	int a=10,b=20,c,d;
	
		public  void method1()
		{
			 //Local Variables 
			c=a+b;
		//	System.out.println(c);
		
			d=a+b;
			System.out.println("Vamshi");
		}

		public void method2()
		{
			 //Local Variables 
			c=a+b;
			//System.out.println(c);
			
			
			d=a+b;
			System.out.println("Surya");
		}
		
		public void method3()
		{
			 //Local Variables
			a=30;
			c=a+b;
		//	System.out.println(c);
			
			
			d=a+b;
			System.out.println("Sai");
		}
		
		public static void name()
		{
			System.out.println("KRishna");
		}
		
		
		public static void main(String[] args) 
		{
			
			Variable_Scope obj=new Variable_Scope()	;
			Variable_Scope.name();
			obj.method3();
			obj.method2();
			
		}

}
