public class box3 {
    double width;
    double height;
    double depth;
    double volume(){
        return width*height*depth;
    }
}
class boxdemo4{
    public static void main(String args[]){
        box3 mybox1=new box3();
        box3 mybox2=new box3();
        double vol;
        mybox1.width=10;
        mybox1.height=20;
        mybox1.depth=15;
        mybox2.width=3;
        mybox2.height=6;
        mybox2.depth=9;
        vol=mybox1.volume();
        System.out.println("volume is :"+vol);
        vol=mybox2.volume();
        System.out.println("volume is :"+vol);
    }
}