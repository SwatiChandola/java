public class boxC {
    double width;
    double height;
    double depth;
    boxC(double w, double h, double d){
        width =w;
        height=h;
        depth=d;
    }
    boxC(){
        width=-1;
        height=-1;
        depth=-1;
    }
    boxC(double len){
        width=height=depth=len;
    }
    double volume(){
        return width*height*depth;
    }
}
class overloadcons{
    public static void main(String args[]){
        boxC mybox1=new boxC(10,20,15);
        boxC mybox2=new boxC();
        boxC mycube=new boxC(7);
        double vol;
        vol=mybox1.volume();
        System.out.println("volume of mybox1 is "+vol);
        vol=mybox2.volume();
        System.out.println("volume of mybox2 is "+vol);
        vol=mycube.volume();
        System.out.println("volume of mybox3 is "+vol);
    }
}