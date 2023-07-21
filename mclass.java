// Define the first interface
interface Interface1 {
    String data = "Interface 1";

    void method1();
}

// Define the second interface
interface Interface2 {
    String data = "Interface 2";

    void method2();
}

// Define a class that implements both interfaces
class MyClass implements Interface1, Interface2 {
    public void method1() {
        System.out.println("Method 1 from Interface 1");
    }

    public void method2() {
        System.out.println("Method 2 from Interface 2");
    }
}

// Main class
public class mclass {
    public static void main(String[] args) {
        // Create an instance of the class
        MyClass obj = new MyClass();

        // Access the data member from Interface1
        System.out.println(obj.data); // Output: Interface 1

        // Call the method from Interface1
        obj.method1(); // Output: Method 1 from Interface 1

        // Access the data member from Interface2
        System.out.println(obj.data); // Output: Interface 2

        // Call the method from Interface2
        obj.method2(); // Output: Method 2 from Interface 2
    }
}
