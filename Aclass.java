abstract class Aclass {
    abstract void Bclass();
  
    public void fun1() {
      System.out.println("Hello Swati!");
    }
  }
  
  class Cclass extends Aclass {
  
    // provide implementation of abstract method
    public void Bclass() {
      System.out.println("Hiee Biee");
    }
  }
  
  class Main {
    public static void main(String[] args) {
      System.out.println("Swati");
      Cclass d1 = new Cclass();
      d1.Bclass();
      d1.fun1();
    }
  }
