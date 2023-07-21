interface polygon{
    void getarea(int length, int breath);
}
class rectangle2 implements polygon{
    public void getarea(int length, int breadth){
        System.out.println("the area of the rectangle is"+(length*breadth));
    }
}
class main1{
    public static void main(String args[]){
        rectangle2 r1=new rectangle2();
        r1.getarea(5,6);
    }
}