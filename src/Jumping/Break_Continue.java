package Jumping;

public class Break_Continue {

	public static void main(String[] args) {

		
		for(int i=1;i<=10;i++) //1<=10 2<=10 5<=10 6<=10 T 11<=10 F 
		{
			//if(i==5) //1==5 2==5 5==5 F 6==5
			if(i>=5)
			{
				//break; //Stop 
			continue;
			} //Exit 
			
			System.out.println(i); //1 2 3 4 6 7 8 9 10
		}
		//Exit 

	}

}
