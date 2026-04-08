// This is Daemon Thread Program.
class CreateThread extends Thread {
    public void run() {
        System.out.println(getName()+"is running as Daemon Thread");
    }
}
public class DaemonThread {
    public static void main(String[] args) {
        CreateThread obj = new CreateThread();
        obj.setDaemon(true);
        obj.setName("SuperMan");
        obj.start();
        System.out.println("Main Thread is End");
    }
}
