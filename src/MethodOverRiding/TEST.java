package MethodOverRiding;

public class TEST
{

	public static void main(String[] args) 
	{
		TRAI tr=new TRAI();
		tr.CallNameDisplayFeature();
		System.out.println();
		
		JIO j=new JIO();
		j.CallNameDisplayFeature();
		System.out.println();
		
		AIRTEL air=new AIRTEL();
		air.CallNameDisplayFeature();
		System.out.println();
		
		BSNL bs=new BSNL();
		bs.CallNameDisplayFeature();
	}

}
