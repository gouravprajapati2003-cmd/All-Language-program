// Multi-Threading Program

class MyThread extends Thread {
    public void main() {
        System.out.println("Thread is Created");
    }
}
class MyThread1 extends Thread {
    public void run() {
        System.out.println("Thread is Successfully Created");
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread1 t2 = new MyThread1();
        t1.start();
        t2.start();
    }
}
