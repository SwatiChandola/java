public class myclass {
    final String message="Hello!";
    void printmessage(){
        System.out.println(message);
    }
    void printfinalmessage(){
        final String finalmessage="Hello, final!";
        System.out.println(finalmessage);
    }
}
class exclass{
    public static void main(String args[]){
        final int VALUE=10;
        System.out.println("The value is: "+VALUE);
        final String MESSAGE="Hello worlds!";
        System.out.println(MESSAGE);
        myclass myobj= new myclass();
        myobj.printmessage();
        myobj.printfinalmessage();
    }
}