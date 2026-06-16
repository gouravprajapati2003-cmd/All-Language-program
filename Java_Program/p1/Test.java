// This is the Package Program imported the package to the other package.
package p1;
import p2.*;

public class Test {
    public static void main(String[] args) {
           MyPackage Gk = new MyPackage();
           Gk.show();
    }
    public void show() {
        System.out.println("Hii User, You are in P1 Package");
    }
}
