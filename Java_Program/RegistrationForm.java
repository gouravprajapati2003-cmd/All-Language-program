import java. awt.*;
import java.awt.event.*;
public class RegistrationForm {
     public static void main(String[] args) {
       Label l1,l2,l3,l4,l5,l6,l7;
       Button btn; 
       Frame f = new Frame("Registration Form");
       TextField txt1,txt2,txt3,txt4,txt5,txt6,txt7;
       l1 = new Label("UserName: ");
       l2 = new Label("Father Name: ");
       l3 = new Label("D.O.B.: ");
       l4 = new Label("Email: ");
       l5 = new Label("Course: ");
       l6 = new Label("Address: ");
       l7 = new Label("Mobile: ");
       btn = new Button("Submit");
       txt1 = new TextField();
       txt2 = new TextField();
       txt3 = new TextField();
       txt4 = new TextField();
       txt5 = new TextField();
       txt6 = new TextField();
       txt7 = new TextField();
       l1.setBounds(100, 100, 80, 30);
       txt1.setBounds(220,100,80,30);
       l2.setBounds(100, 150, 80, 30);
       txt2.setBounds(220,150,80,30);
       l3.setBounds(100, 200, 80, 30);
       txt3.setBounds(220,200,80,30);
       l4.setBounds(100, 250, 80, 30);
       txt4.setBounds(220,250,80,30);
       l5.setBounds(100, 300, 80, 30);
       txt5.setBounds(220,300,80,30);
       l6.setBounds(100, 350, 80, 30);
       txt6.setBounds(220,350,80,30);
       l7.setBounds(100, 400, 80, 30);
       txt7.setBounds(220,400,80,30);
       btn.setBounds(150,480,80,30);
       f.add(l1);
       f.add(txt1); 
       f.add(l2); 
       f.add(txt2); 
       f.add(l3); 
       f.add(txt3); 
       f.add(l4); 
       f.add(txt4); 
       f.add(l5); 
       f.add(txt5); 
       f.add(l6); 
       f.add(txt6); 
       f.add(l7); 
       f.add(txt7);
       f.add(btn);
         f.setSize(400, 400);
         f.setLayout(null);
         f.setVisible(true);
         f.addWindowListener(new WindowAdapter() {
          public void windowClosing(WindowEvent e) {
               System.exit(0);
          }
        }); 
     } 
}
