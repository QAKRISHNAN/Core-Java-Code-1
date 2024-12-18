package Operators;

public class Logical_Operators {

	public static void main(String[] args) {

		//boolean a=true,b=true;
		//boolean a=true,b=false;
		//boolean a=false,b=true;
		boolean a=false,b=false;
		
		System.out.println(a&b); //True False False
		System.out.println(a||b); //True True False
		
		System.out.println(!a); //false True
		System.out.println(!b); //True True
		
		System.out.println(!(a&&b)); //True True
		System.out.println(!(a||b)); //false True
	}

}
