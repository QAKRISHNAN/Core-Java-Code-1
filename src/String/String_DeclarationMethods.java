package String;

import java.util.Scanner;

public class String_DeclarationMethods {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//Static 
		//Heap == Pool
		/*String name1="Krishna"; //1kb
		String name2="Krishna"; //1kb
		String name3="Krishna"; //1kb 3
		String name4="SaiRam"; //1kb 3
		*/
		System.out.println("Enter any String: ");
		String name=scan.nextLine();
		String name1=scan.next();
		String name2=scan.next();
		String name3=scan.next();
		String name4=scan.next();
		
		System.out.println(name);
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		System.out.println(name4);
		
		//Stack == Out of Pool 
		
		String name5=new String("Prakash"); //1kb
		String name6=new String("Prakash"); //1kb
		String name7=new String("Prakash"); //1kb
		
		System.out.println(name5);
		System.out.println(name6);
		System.out.println(name7);
	}

}
