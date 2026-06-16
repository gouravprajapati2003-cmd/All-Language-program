import java. awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class AwtDemo {
     public static void main(String[] args) {
        Frame f = new Frame("Test");
        Button b = new Button("Click Menu");
        b.setBounds(50,50,80,40);
        f.add(b);
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
          public void windowClosing(WindowEvent e) {
               System.exit(0);
          }
        });
     }
}
