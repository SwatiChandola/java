interface polygon{
    void getarea();
    default void getsides(){
        System.out.println("I can get sides of a polygon");
    }
}
class rectangle1 implements polygon{
    public void getarea(){
        int length=6;
        int breadth=5;
        int area=length*breadth;
        System.out.println("the area of rectangle is"+area);
    }
    public void getsides(){
        System.out.println("I have 4 sides.");
    }
}
class square implements polygon{
    public void getarea(){
        int length=5;
        int area= length*length;
        System.out.println("the area of the square is"+area);
    }
}
class main1{
    public static void main(String args[]){
        rectangle1 r1= new rectangle1();
        r1.getarea();
        r1.getsides();
        square s1= new square();
        s1.getarea();
        s1.getsides();
    }
}