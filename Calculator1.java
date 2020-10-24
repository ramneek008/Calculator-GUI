import javax.swing.*;
import java.awt.event.*;

public class Calculator1{
    JFrame f;
    JTextField tf1;
    JButton b1, b2, b3, b4, b5;
    Calculator1(){
        f = new JFrame("Calculator");
        tf1 = new JTextField();
        tf1.setBounds(100,80,180,30);

        b1 = new JButton("+");
        b1.setBounds(120,150,50,30);

        b2 = new JButton("-");
        b2.setBounds(200,150,50,30);

        b3 = new JButton("*");
        b3.setBounds(120,200,50,30);

        b4 = new JButton("/");
        b4.setBounds(200,200,50,30);

        b5 = new JButton("=");
        b5.setBounds(150,250,70,30);

        f.add(tf1);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);

        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String args[]){
        new Calculator1();
    }
}
