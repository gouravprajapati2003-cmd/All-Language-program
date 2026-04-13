// Calculator program Using Java program and function
import java.awt.*;
import java.awt.event.*;

public class Calculator {
    public static void main(String[] args) {

        Frame f = new Frame("Calculator");

        Label l1 = new Label("Number 1:");
        Label l2 = new Label("Number 2:");
        Label l3 = new Label("Result:");

        TextField txt1 = new TextField();
        TextField txt2 = new TextField();
        Label result = new Label();

        Button add = new Button("+");
        Button sub = new Button("-");
        Button mul = new Button("*");
        Button div = new Button("/");
        Button clear = new Button("C");

        l1.setBounds(50, 50, 80, 20);
        txt1.setBounds(150, 50, 100, 20);

        l2.setBounds(50, 100, 80, 20);
        txt2.setBounds(150, 100, 100, 20);

        l3.setBounds(50, 150, 80, 20);
        result.setBounds(150, 150, 100, 20);

        add.setBounds(50, 200, 50, 30);
        sub.setBounds(110, 200, 50, 30);
        mul.setBounds(170, 200, 50, 30);
        div.setBounds(230, 200, 50, 30);
        clear.setBounds(290, 200, 50, 30);

        f.add(l1); f.add(txt1);
        f.add(l2); f.add(txt2);
        f.add(l3); f.add(result);
        f.add(add); f.add(sub); f.add(mul); f.add(div); f.add(clear);

        add.addActionListener(e -> {
            int a = Integer.parseInt(txt1.getText());
            int b = Integer.parseInt(txt2.getText());
            result.setText(String.valueOf(a + b));
        });

        sub.addActionListener(e -> {
            int a = Integer.parseInt(txt1.getText());
            int b = Integer.parseInt(txt2.getText());
            result.setText(String.valueOf(a - b));
        });

        mul.addActionListener(e -> {
            int a = Integer.parseInt(txt1.getText());
            int b = Integer.parseInt(txt2.getText());
            result.setText(String.valueOf(a * b));
        });

        div.addActionListener(e -> {
            int a = Integer.parseInt(txt1.getText());
            int b = Integer.parseInt(txt2.getText());
            if (b != 0)
                result.setText(String.valueOf(a / b));
            else
                result.setText("Error");
        });

        clear.addActionListener(e -> {
            txt1.setText("");
            txt2.setText("");
            result.setText("");
        });

        f.setSize(350, 300);
        f.setLayout(null);
        f.setVisible(true);

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
    }
}