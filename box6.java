public class box6 {
    double width;
    double height;
    double depth;
    box6(double w, double h, double d){
        width=w;
        height=h;
        depth=d;
    }
    double volume(){
        return width*height*depth;
    }
}
class boxdemo7{
    public static void main(String args[]){
        box6 mybox1=new box6(10,20,15);
        box6 mybox2=new box6(3,6,9);
        double vol;
        vol=mybox1.volume();
        System.out.println("volume is :"+vol);
        vol=mybox2.volume();
        System.out.println("volume is :"+vol);
    }
}