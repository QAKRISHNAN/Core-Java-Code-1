package Loops;

public class Nested_DoWhile_Loop 
{

	public static void main(String[] args) 
	{
		int i = 1;
        do {
            int j = 1;
            do {
                System.out.println(i + " * " + j + " = " + (i * j));
                j++;
            } while (j <= 10);
            i++;
        } while (i <= 1);

	}

}
