// It is Synchorization program With Thread 

class Table {
     synchronized public void PrintTable (int n) {
        for(int i=1; i<=10; i++) {
            System.out.println(n*i);
        }
        System.out.println(" ");
    }
}
class Thread1 extends Thread {
    Table t;
    Thread1(Table t) {
            this.t = t;
        }
    public void run() {  
        t.PrintTable(3);
    }
}
class Thread2 extends Thread {
    Table t;
    Thread2(Table t) {
            this.t = t;
        }
    public void run() {  
        t.PrintTable(5);
    }
}
class Thread3 extends Thread {
    Table t;
    Thread3(Table t) {
            this.t = t;
        }
    public void run() {  
        t.PrintTable(7);
    }
}
class Thread4 extends Thread {
    Table t;
    Thread4(Table t) {
            this.t = t;
        }
    public void run() {  
        t.PrintTable(9);
    }
}
class Thread5 extends Thread {
    Table t;
    Thread5(Table t) {
            this.t = t;
        }
    public void run() {  
        t.PrintTable(11);
    }
}
public class SynchorizationThread {
    public static void main(String[] args) {
        Table obj = new Table();
        Thread1 t1 = new Thread1(obj);
        Thread2 t2 = new Thread2(obj);
        Thread3 t3 = new Thread3(obj);
        Thread4 t4 = new Thread4(obj);
        Thread5 t5 = new Thread5(obj);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}