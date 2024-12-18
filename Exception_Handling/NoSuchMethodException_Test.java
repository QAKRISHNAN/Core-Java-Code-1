package Exception_Handling;

public class NoSuchMethodException_Test {

	public static void main(String[] args) {
		NoSuchMethodException obj = new NoSuchMethodException();
        obj.method1("This is the first method");
        obj.method2("This is the missiong method");

	}

}
