package Type_Coversion;

public class TypeCoversion_Types {

	public static void main(String[] args) {
		
	//1.Implicit[Automation][Widening]:
		//byte-short-char-int-long-float-double
		
		//byte to short 10 
		//byte a=10;
		//	short b=a;
		
		//int to float or double 
		//int a=123;
		//float b=a;
		
		//char to int or float
		/*char a='i';
		//int b=a;
		float b=a;
		System.out.println("Actual Value: "+a);
		System.out.println("Converted Value: "+b);
		*/
		
		//2.Explicit[Manual][Narroing]:
		//double-float-long-int-char-short-byte
		//byte a=130;
		//short a=130;
		//byte b=(byte)a;
		//float to int
		//float a=24.5f;
		//int b=(int)a;
		
		//int a=105;
		float a=105.5f;
		char b=(char)a;
		
		
		System.out.println("Actual Value: "+a);
		System.out.println("Converted Value: "+b);
		
		//Type mismatch: cannot convert from int to byte
		//Type mismatch: cannot convert from float to int
		//Type mismatch: cannot convert from int to char
	}

}
