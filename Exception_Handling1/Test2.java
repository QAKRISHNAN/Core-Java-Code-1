package Exception_Handling1;

public class Test2 {

	public static void main(String[] args) {

int a[]= {1,2,3,4,5};
try
{
for(int i=0;i<4;i++)
{
	System.out.println(a[i]);
}
}
catch(ArrayIndexOutOfBoundsException e)
{
	//System.out.println(e);
	System.out.println(e.getMessage());
	System.out.println("Catched Exception");
}
	}
//Index 5 out of bounds for length 5
//java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5

}
