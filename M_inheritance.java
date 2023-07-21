public class M_inheritance {
    void funcA() {
        System.out.println("This is class A");
     }
  }
  class Minheritance extends M_inheritance {
     void funcB() {
        System.out.println("This is class B");
     }
  }
  class Mlinheritance extends Minheritance {
     void funcC() {
        System.out.println("This is class C");
     }
  }

class Demo {
     public static void main(String args[]) {
      System.out.println("Swati");
        Mlinheritance obj = new Mlinheritance();
        obj.funcA();
        obj.funcB();
        obj.funcC();
     }
}
