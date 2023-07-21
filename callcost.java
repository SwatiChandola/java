public class callcost {
    public static void main(String args[]){
        double balance=170;
        double rate=1.02;
        double duration=37;
        double cost;
        cost=duration*rate;
        balance=balance-cost;
        System.out.println("Call Duration");
        System.out.println(duration);
        System.out.println("Seconds");
        System.out.println("Balance:"+balance+" Rupee:"+cost);
    }
}
