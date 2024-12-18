package Operators;

public class Relational_Logical_Operators {

	public static void main(String[] args) {
		
		int age=20,weight=30;
		//int age=20,weight=10;
		//int age=10,weight=30;
		//int age=10,weight=10;
		
		System.out.println(age>=18 && weight>=20);
		System.out.println(age>=18 || weight>=20);
		
		System.out.println(!(age>=18 || weight>=20));
		  
	}

}
