package Interface;

interface MI_PArent1 //abstract class-->No Implementation 
{
	public void Father1();
	
}

interface MI_PArent2
{
	public void Father2();
}

public class MI_Child implements MI_PArent1,MI_PArent2
{
	public void Father1()
	{
		System.out.println("I am your Father1");
	}
	public void Father2()
	{
		System.out.println("I am your Father2");
	}
	
	public void Child()
	{
		System.out.println("I am your Child");
	}
	
	public static void main(String[] args)
	{
		MI_Child mic=new MI_Child();
		mic.Father1();
		mic.Father2();
		mic.Child();
	}
}
