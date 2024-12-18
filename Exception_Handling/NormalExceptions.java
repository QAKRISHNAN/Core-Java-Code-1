package Exception_Handling;

public class NormalExceptions {

	public static void main(String[] args) 
	{
		
		//ArithmeticException
	/*	int a=10,b=0,c;
		c=a/b;
		System.out.println(c); 
		
		System.out.println("Performed Division");
		System.out.println("Sucess");
		System.out.println("Thanku");*/
		
		
		//ArrayIndexOutOfBoundsException
	/*	int a[]= {1,2,3,4,5}; 
		for(int i=0;i<6;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("Performed Array Printing");
		System.out.println("Sucess");
		System.out.println("Thanku");*/
		
		//NullPointerException
		String name=null;
		System.out.println(name.length());
		
		System.out.println("Finding given String Length");
		System.out.println("Sucess");
		System.out.println("Thanku");
	}

}
