package Strings;

import java.util.Arrays;

public class String_Functions {

	public static void main(String[] args) {
		/*	//1.String length() Method:
		String name="FullStack Java"; //Static 
		int len=name.length();
		System.out.println("Length of given String is: "+len);
		//System.out.println("Length of given String is: "+name.length());

			
		//2.String copyValueOf() Method:
		//String to String
		String name1="Core Java";
		String name2="";
		System.out.println(name2.valueOf(name1));
		// Char Array to String
		char name3[]= {'R','A','N','I'};
		String name4="";
		System.out.println(name4.copyValueOf(name3));

		
		//3.Java String toLowerCase() Method
		//String name5="SIRISHA";
		String name5="SIRisha";
		System.out.println(name5.toLowerCase());
			
			
		//4.Java String toUpperCase() Method
		
		//String name6="Mounika";
		String name6="MOUnika";
		System.out.println(name6.toUpperCase());
		System.out.println(name6.toLowerCase());
				
		//5.Java String replace() Method:	
			String name7="Kreshna";
			System.out.println(name7);
			//Single Character Replace
			System.out.println(name7.replace('e', 'i'));
			//String Replace
			String name8="Khsanri";
			System.out.println(name8);
			System.out.println(name8.replace("Khsanri", "Krishna"));
			
			//6.Java String trim() Method
			String name9="  FullStack Java Course  ";
			System.out.println(name9);
			System.out.println(name9.trim());
			
			//7.String concat() Method
			
			String name10=" Rohith";
			String name11=" Sai";
			System.out.println(name10.concat(name11));
			System.out.println(name11.concat(name10));
			System.out.println(name11.concat(name11));
			
			//8.String isEmpty() Method
			
			String name12="abcd";
			System.out.println(name12.isEmpty());
			
			String name13="";
			System.out.println(name13.isEmpty());
			
			//9.Java String equals() Method:
			
			String name14="Rani";
			String name15="Mani";
			System.out.println(name14.equals(name15));
			*/
			
			//10.String getBytes() Methods
			//String name16 = "ABCD";  //65 66 67 68
			String name16 = "JAva";  
			byte[] byteArray;
			byteArray = name16.getBytes();
			System.out.println(Arrays.toString(byteArray));
	}

}
