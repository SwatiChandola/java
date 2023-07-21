import java.lang.Math;
interface polygon{
    void getarea();
    default void getperimeter(int... sides){
        int perimeter=0;
        for(int side: sides){
            perimeter+=side;
        }
        System.out.println("Perimeter:"+perimeter);
    }
}
class triangle implements polygon{
    private int a, b, c;
    private double s, area;
    triangle(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
        s=0;
    }
    public void getarea(){
        s=(double)(a+b+c)/2;
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area:"+area);
    }
}
class main{
    public static void main(String args[]){
    triangle t1=new triangle(2,3,4);
    t1.getarea();
    t1.getperimeter(2,3,4);
}
}
