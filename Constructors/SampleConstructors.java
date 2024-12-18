package Constructors;

public class SampleConstructors 
{
	public SampleConstructors()  //Constructors
	{
		//System.out.println("I am Constructor");
	int a=10,b=20,c;
		c=a+b;
		System.out.println("Addition: "+ c);
	}
	
	public void Sample()
	{
		System.out.println("I am Method1 ");
	}
	public void Sample1()
	{
		System.out.println("I am Method2 ");
	}
	
	
public static void main(String[] args) 
{
	SampleConstructors obj=new SampleConstructors();
	
	//obj.Sample();
	//obj.Sample1();
	Test obj1=new Test();
	
}
}
