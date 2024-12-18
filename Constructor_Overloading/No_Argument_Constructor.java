package Constructor_Overloading;

public class No_Argument_Constructor {
    private String name;
    private int age;

    // No-argument constructor
    public No_Argument_Constructor() {
        name = "Unknown";
        age = 20;
    }

    public static void main(String[] args) {
        No_Argument_Constructor obj = new No_Argument_Constructor();
        System.out.println("Name: " + obj.name);
        System.out.println("Age: " + obj.age);
    }
}
