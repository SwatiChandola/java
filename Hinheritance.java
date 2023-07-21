public class Hinheritance {
    void fun1(){System.out.println("Hello...");}  
    }  
    class Dog extends Hinheritance{  
    void fun2(){System.out.println("Hieee...");}  
    }  
    class Cat extends Hinheritance{  
    void fun3(){System.out.println("Bieee...");}  
    }  
    class TestInheritance3{  
    public static void main(String args[]){  
        System.out.println("Swati");
    Cat c=new Cat();  
    c.fun3();  
    c.fun1();
    // c.fun2()   //Error  
    }
}
