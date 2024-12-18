package Inheritance;

public class ML_Test {

	public static void main(String[] args) {


		ML_Child ch=new ML_Child();
		ch.ANR();
		ch.Nagarjuna();
		ch.NagChaithanya();
		System.out.println();
		
		ML_Parent_Child pc=new ML_Parent_Child();
		pc.ANR();
		pc.Nagarjuna();
		System.out.println();
		
		ML_Parent p=new ML_Parent();
		p.ANR();
		
		

	}

}
