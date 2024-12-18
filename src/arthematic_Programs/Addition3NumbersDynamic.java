
package arthematic_Programs;
import java.util.Scanner;

public class Addition3NumbersDynamic {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter any Three Values: ");
	
	int v1=scan.nextInt(),v2=scan.nextInt(),v3=scan.nextInt(),sum;
	
	 sum=v1+v2+v3;	
	
	 System.out.println("Addition: "+sum);
	
	 scan.close();
	}

}
