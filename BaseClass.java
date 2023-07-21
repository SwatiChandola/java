public class BaseClass {
    private int arg1;
    private int arg2;

    public BaseClass(int arg1, int arg2) {
        this.arg1 = arg1;
        this.arg2 = arg2;
        System.out.println("BaseClass constructor called with arg1=" + arg1 + " and arg2=" + arg2);
    }
}

class SubClass extends BaseClass {
    private int arg3;

    public SubClass(int arg1, int arg2, int arg3) {
        super(arg1, arg2);
        this.arg3 = arg3;
        System.out.println("SubClass constructor called with arg1=" + arg1 + ", arg2=" + arg2 + " and arg3=" + arg3);
    }
    
    public static void main(String[] args) {
        SubClass obj = new SubClass(1, 2, 3);
    }
}