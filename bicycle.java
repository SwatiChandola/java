import java.io.*;
interface vehicle{
    void changegear(int a);
    void speedup(int a);
    void applybrakes(int a);
}
class bicycle implements vehicle{
    int speed;
    int gear;
    public void changegear(int newgear){
        gear=newgear;
    }
    public void speedup(int increment){
        speed= speed+ increment;
    }
    public void applybreaks(int decrement){
        speed= speed-decrement;
    }
    public void printstates(){
        System.out.println("speed:"+speed+" gear:"+gear);
    }
}
class bike implements vehicle{
    int speed;
    int gear;
    public void changegear(int newgear){
        gear= newgear;
    }
    public void speedup(int increment){
        speed=speed+increment;
    }
    public void applybrakes(int decrement){
        speed= speed-decrement;
    }
    public void printstates(){
        System.out.println("speed:"+speed+" gear:"+gear);
    }
}
class gfg{
    public static void main(String args[]){
        bicycle bycycle= new bicycle();
        bycycle.changegear(2);
        bycycle.speedup(3);
        bycycle.applybrakes(1);
        System.out.println("Bicycle present state:");
        bycycle.printstates();
        bike byke=new bike();
        byke.changegear(1);
        byke.speedup(4);
        byke.applybrakes(3);
        System.out.println("Bike present state:");
        byke.printstates();
    }
}