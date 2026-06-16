package p2;
// Lambda Exoression Thread Program;
public class LambdaThread {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{System.out.println("With The Help of Lambda Expression");});
        t1.start();
    }
}
