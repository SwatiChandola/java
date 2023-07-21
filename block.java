public class block {
    public static void main(String args[]){
        int x=10;
        blk1:
        {
            int y=50;
            System.out.println("inside the block 1:");
            System.out.println("x:"+x);
            System.out.println("y:"+y);
        }
        blk2:
        {
            int y=20;
            System.out.println("inside the block 2:");
            System.out.println("x:"+x);
            System.out.println("y:"+y);
        }
        System.out.println("outside the block:x is "+x);
    }
}
