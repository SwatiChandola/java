public class prog3 {
    int sno;  
    String name;  
    float fee;  
    prog3(int sno,String name,float fee){  
       this.sno=sno;  
       this.name=name;  
       this.fee=fee;  
       }  
    void display(){System.out.println(sno+" "+name+" "+fee);}  
}  
class TestThis{  
    public static void main(String args[]){  
            
            student s1=new student(111,5000f);  
            student s2=new student(112,6000f);  
            s1.display();  
            s2.display();  
            }
}
