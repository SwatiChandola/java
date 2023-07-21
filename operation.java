public class operation{  
    int square(int n){  
     return n*n;  
    }  
}  
     
   class Circle{  
    operation op;//aggregation  
    double pi=3.14;  
       
    double area(int radius){  
      op =new operation();  
      int rsquare=op.square(radius); 
      return pi*rsquare;  
    }   
    public static void main(String args[]){ 
      System.out.println("Swati"); 
      Circle c=new Circle();  
      double result=c.area(5);  
      System.out.println(result);  
    }  
  }  