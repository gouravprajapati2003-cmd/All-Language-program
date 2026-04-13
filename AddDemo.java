import java. awt.*;
import java.awt.event.*;
public class AddDemo implements ActionListener {
    public static void main(String[] args) {
        Label l1,l2,l3,l4;
        Button btn;
        Frame f = new Frame();
        TextField txt1,txt2,txt3;
        l1 = new Label("Number 1: ");
        l2 = new Label("Number 2: ");
        l3 = new Label("Result: ");
        l4 = new Label();
        btn = new Button("+");
        txt1 = new TextField();
        txt2 = new TextField();
        txt3 = new TextField();
        l1.setBounds(100, 100, 80, 20);
        txt1.setBounds(220,100,80,30);
        l2.setBounds(100, 150, 80, 20);
        txt2.setBounds(220, 150, 80, 30);
        l3.setBounds(100, 100, 80, 20);
        txt3.setBounds(220, 150, 80, 30);
        btn.setBounds(100, 200, 100, 30);
        
        l3.setBounds(150,250,150,60);
        l4.setBounds(300,250,150,60);
         f.add(l1);
         f.add(txt1);
         f.add(l2);
         f.add(txt2);
         f.add(l3);
         f.add(txt3);
         f.add(btn);
         f.add(l3);
         f.add(l4);
         btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            int a = Integer.parseInt(txt1.getText());
            int b = Integer.parseInt(txt2.getText());
            int c = a+b;
            String Result=String.valueOf(c);
           l4.setText(Result);
         }
        });
         f.setSize(400, 400);
         f.setLayout(null);
         f.setVisible(true);
         f.addWindowListener(new WindowAdapter() {
          public void windowClosing(WindowEvent e) {
               System.exit(0);
          }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
