public class A {
    final void m1() {
        System.out.println("This is a final method.");
    }
}

class B extends A {
    void n1() {
        System.out.println("Illegal"); // error can not override
    }
}