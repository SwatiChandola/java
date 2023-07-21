interface Interface1 {
    int data = 10; 
    void method1(); 
}
interface Interface2 {
    int data = 20;
    void method2(); 
}
class MyClass implements Interface1, Interface2 {
    public void method1() {
        System.out.println("Method 1 implementation");
    }
    public void method2() {
        System.out.println("Method 2 implementation");
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        System.out.println("Swati");
        MyClass obj = new MyClass();
        obj.method1();
        obj.method2();
        System.out.println("Data from Interface1: " + Interface1.data);
        System.out.println("Data from Interface2: " + Interface2.data);
    }
}

