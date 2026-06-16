// Using Runnable Interface
package p1;
class CreateThread implements Runnable {
    public void run() {
        System.out.println("Thread is Running");
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        CreateThread ct = new CreateThread();
        Thread t = new Thread(ct, "Thread1");
        t.start();
        System.out.println(t.getName());
    }
}
