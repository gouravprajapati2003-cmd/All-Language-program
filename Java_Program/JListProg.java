//import java.awt.*;
import javax.swing.*;

public class JListProg {
    public static void main(String[] args) {

        String[] list = {"Sunday", "Monday"};

        JFrame jf = new JFrame("Test");
        jf.setLayout(null);   // important for setBounds

        JList<String> jl = new JList<>(list);
        jl.setBounds(120, 150, 120, 60);

        jf.add(jl);

        jf.setSize(400, 400);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}