class area{
    void Area(float x){
        System.out.println("the area of the square is "+Math.pow(x, 2)+" sq units");
    }
    void Area(float x, float y){
        System.out.println("the area of the rectangle is "+x*y+" sq units");
    }
    void Area(double x,double y){
        double z = 0.5 * x * y;
        System.out.println("the area of the tringle is "+z+" sq units");
    }
}
class Overload{
     public static void main(String args[]) {
       System.out.println("Swati");
	   area ob = new area();
	   ob.Area(5);
	   ob.Area(11,12);
	   ob.Area(2.5,2);
        }
}