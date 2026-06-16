import java. awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class AwtDemo1 {
    public static void main(String[] args) {
        Frame f = new Frame("Test");
        TextField txt = new TextField();
        Button btn = new Button("Click Me");
        Label lbl = new Label("Name");
        lbl.setBounds(50,50,40,20);
        txt.setBounds(100,50,80,30);
        btn.setBounds(20, 100, 80, 20);
        f.add(lbl);
        f.add(txt);
        f.add(btn);
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
