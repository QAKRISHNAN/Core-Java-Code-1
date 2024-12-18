package MethodOverLoading;

public class Number_Arguments 
{
	//Area of a Circle
	public float area(float radius) 
	{
	return (float) (radius * radius * 3.14); //Pie r sequre
	}
	//Area of a Rectangle
	public float area(float length, float width)  //l * w 
	{
	return (length * width); 
	}
	public static void main(String args[]) 
	{
		Number_Arguments a = new Number_Arguments();
		
	System.out.println("Area of rectangle: " + a.area(2.5f, 2.5f));
	System.out.println("Area of rectangle: " + a.area(5.0f, 5.0f));
	
	System.out.println("Area of circle: " + a.area(2.5f));
	} 
	}

