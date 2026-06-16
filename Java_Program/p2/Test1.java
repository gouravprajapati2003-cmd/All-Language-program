package p2;
// Synchronization Block
class Msg {
    public void show(String name) {
        synchronized(this) {
            for(int i=0; i<3; i++) {
                System.out.println(" "+ name);
            }
        }
    }
}
class OurThread extends Thread {
    Msg m;
    String name;
    OurThread(Msg m, String name) {
        this.m = m;
        this.name = name;
    }
    public void run() {
    m.show(name);
}
}
public class Test1 {
    public static void main(String[] args) {
        Msg r = new Msg();
        OurThread t1 = new OurThread(r, "Gourav Kumar");
        OurThread t2 = new OurThread(r, "Sourav Kumar");
        t1.start();
        t2.start();
    }
}
