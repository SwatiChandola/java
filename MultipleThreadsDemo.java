class ChildThread extends Thread {
    private String message;
    public ChildThread(String message) {
        this.message = message;
    }
    public void run() {
        System.out.println(message);
    }
}
public class MultipleThreadsDemo {
    public static void main(String[] args) {
        System.out.println("Swati");
        ChildThread thread1 = new ChildThread("Thread 1");
        ChildThread thread2 = new ChildThread("Thread 2");
        ChildThread thread3 = new ChildThread("Thread 3");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
