package String;

import java.util.Arrays;

public class String_Methods {

	public static void main(String[] args) {
		
		
		// 1.String length() Method:
		
		/*		
		String s1="Krishna";
		 s1="Core Java";
		//System.out.println("Length of given String is: "+s1.length());
		
		 int strlen=s1.length();
		 System.out.println("Length of given String is: "+strlen);
			
		
		//2.String copyValueOf() Method:

		//String s2="Krishna";
		char s2[]={'K','r','s','h','n','a'};
		
		String s3="";
		
		//System.out.println(s2.valueOf(s3)); //String to String 
		System.out.println(s3.copyValueOf(s2));
		
		
		//3.Java String toLowerCase() Method: abcd 
		
		String s4="ABCDefgh";
		System.out.println("Actual String: "+s4);
		System.out.println("Lower Case String: "+s4.toLowerCase());
		
		
		//4.Java String toUpperCase() Method: ABCD 
		
		String s5="abcdEFGH";
		System.out.println("Actual String: "+s5);
		System.out.println("Upper Case String: "+s5.toUpperCase());
		
		
		//5. Java String replace() Method:
		
		//Kreshna e replace i  Advance Java Advanced replace Core 
		
		String s6="Kreshna";
		System.out.println("Actual String: "+s6);
		//System.out.println("Replaced String: "+s6.replace('e', 'i'));
		
		String s7="Prakash Java Student";
		//System.out.println("Replaced String: "+s6.replace(s6, "Prakash Java Student"));
		
		System.out.println("Replaced String: "+s6.replace(s6, s7));
		
		
		//6. Java String trim() Method: White Space 
		
		String s7="  Prakash Java Student  ";
		System.out.println("Actual String:"+s7);
		System.out.println("Trimmed  String:"+s7.trim());
		
		
		//7.String concat() Method:
		
		String s8="Prakash";
		String s9=" Java Student  ";
		
		System.out.println("Combined  String:"+s8.concat(s9));
		System.out.println("Combined  String:"+s9.concat(s8));
		System.out.println("Combined  String:"+s8.concat(s8));
		System.out.println("Combined  String:"+s9.concat(s9));
		
		
		//8. String isEmpty() Method:
		
		//String s10="Prakash";
		String s10="";
		
		System.out.println("String result:"+s10.isEmpty());
		
		
		//9. Java String equals() Method:
		
		String s11="Prakash";
		String s12="Prakash";
		
		System.out.println("String result:"+s11.equals(s12));
		*/
		
		//10.String getBytes() Methods:
		
		//ABCD 65 66 67 68 
		
		//String s13 = "ABCD";
		String s13 = "Java Core";
		byte byteArray[];
		byteArray = s13.getBytes();
		System.out.println(Arrays.toString(byteArray));
	}

}
