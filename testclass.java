import java.io.*;
interface in1{
    final int a=10;
    void display();
}
class testclass implements in1{
    public void display(){
        System.out.println("geek");
    }
    public static void main(String args[]){
        testclass t=new testclass();
        t.display();
        System.out.println(a);
    }
}