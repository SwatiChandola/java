class rectangle{ 
       int length; 
       int breadth; 
       void input(int l, int b) {  
         length =l; 
         breadth=b; 
       } 
       void output(){
        System.out.println("lenght:"+length);
        System.out.println("breadth:"+breadth);
       }
       int calcarea() { 
         int rectArea; 
         rectArea = length * breadth; 
         return rectArea; 
       } 
 } 
 class RectangleArea{ 
          public static void main(String[] args) {  
            System.out.println("Swati");
            rectangle firstRect = new rectangle(); 
            firstRect.input(5,6);
            firstRect.output(); 
            int result = firstRect.calcarea(); 
            System.out.println("Area of Rectangle = "+ result); 
      } 
 } 