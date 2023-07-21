public class box2 {
    double width; 
    double height;
    double depth;
    void volume(){
        System.out.print("Volume is");
        System.out.println(width*height*depth);
    }
}
class boxdemo3{
    public static void msin(String args[]){
        box2 mybox1=new box2();
        box2 mybox2=new box2();
        mybox1.width=10;
        mybox1.height=20;
        mybox1.depth=15;
        mybox2.width=3;
        mybox2.height=6;
        mybox2.depth=9;
        mybox1.volume();
        mybox2.volume();
    }
}