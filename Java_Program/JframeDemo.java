//import java.awt.*;
import javax.swing.*;
//import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;
public class JframeDemo {
     public static void main(String[] args) {
        JButton btn;
        JRadioButton rb;
        //String Day[]={"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
        JFrame obj = new JFrame();
        btn = new JButton("Submit");
        rb = new JRadioButton("Male");
        JCheckBox cb = new JCheckBox();
       // JList l1 = new JList(DAY);
       // l1.addElement
        JPasswordField jsp = new JPasswordField("MCA");     
        jsp.setBounds(100,150,120,30);  
        obj.add(jsp); 
        btn.setBounds(100, 200, 100, 30); 
        rb.setBounds(100, 10, 100, 30);
        cb.setBounds(100, 50, 100, 30);
        //l1.setBounds(50, 50, 100, 30);
        obj.add(btn);
        obj.add(rb);
        obj.add(cb);
        //obj.add(l1);
        obj.setLayout(null);
        obj.setSize(400,400);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }
}
