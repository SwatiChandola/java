public class box5 {
    double width;
    double height;
    double depth;
    box5(){
        System.out.println("Constructing Box");
        width=10;
        height=10;
        depth=10;
    }
    double volume(){
        return width*height*depth;
    }
}
class boxdemo6{
    public static void main(String args[]){
        box5 mybox1=new box5();
        box5 mybox2=new box5();
        double vol;
        vol=mybox1.volume();
        System.out.println("volume is :"+vol);
        vol=mybox2.volume();
        System.out.println("volume is :"+vol);
    }
}
