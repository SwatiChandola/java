public class box1 {
    double width;
    double height;
    double depth;
}
class boxdemo2 {
    public static void main(String args[]){
        box1 mybox1= new box1();
        box1 mybox2= new box1();
        double vol;
        mybox1.width=10;
        mybox1.height=20;
        mybox1.depth=15;
        mybox2.width=3;
        mybox2.height=6;
        mybox2.depth=9;
        vol=mybox1.width*mybox1.height*mybox1.depth;
        System.out.println("Volume is "+vol);
        vol=mybox2.width*mybox2.height*mybox2.depth;
        System.out.println("Volume is "+vol);
    }
}