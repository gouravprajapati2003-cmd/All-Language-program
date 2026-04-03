// This is the Package program.
package p2;
import p1.*;

public class MyPackage {
    public void show() {
        System.out.println("Hello User, You in P2 Package");
    }
    public static void main(String[] args) {
       Test obj = new Test();
      obj.show();
    }
}
