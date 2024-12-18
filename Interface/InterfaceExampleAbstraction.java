package Interface;
interface Sample
{
public void add();	
}
public class InterfaceExampleAbstraction implements Sample

{
	public void add()
	{
		int a=10,b=20;
		System.out.println(a+b);
	}
	
	/*public static void main(String[] args) 
	{
		InterfaceExampleAbstraction obj=new InterfaceExampleAbstraction();
		obj.add();
	}*/

}
