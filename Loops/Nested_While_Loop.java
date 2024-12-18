package Loops;

public class Nested_While_Loop {

	public static void main(String[] args) {
		int i = 1, j = 1;
		while (i <= 3) {
			System.out.println("Outer loop iteration " + i);
			while (j <= 3) {
				System.out.println(" Inner loop iteration " + j);
				j++;
			}
			j = 1; // reset j to 1 for the next iteration of the outer loop
			i++;
		}

	}

}
