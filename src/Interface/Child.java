package Interface;

interface Parent  //Interface  Class [Car User] 
{
	void Break();  //Stop 
}

public class Child implements Parent     //Normal [Manufacture:Working]
{
	public void Break()
	{
		System.out.println("A car brake works by using a hydraulic system to apply "
				+ "pressure on brake \n pads, which then press against a spinning disc (rotor) "
				+ "on the wheel, \n "
				+ "creating friction that slows the car down");
	}

	public static void main(String[] args) 
	{
		
		Child c=new Child();
		c.Break();
	}
}
