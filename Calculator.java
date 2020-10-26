import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Calculator {
    JFrame f;
    JTextField tf1;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19;
    Calculator(){
        f = new JFrame();
        
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b10 = new JButton("0");
        b11 = new JButton("+");
        b12 = new JButton("-");
        b13 = new JButton("*");
        b14 = new JButton("/");
        b15 = new JButton("√");
        b16 = new JButton("C");
        b17 = new JButton(".");
        b18 = new JButton("=");
        b19 = new JButton("Backsp");

        b7.setBounds(50,150,45,30);
        b7.setBackground(Color.LIGHT_GRAY);
        b7.setForeground(Color.BLUE);

        b8.setBounds(110,150,45,30);
        b8.setBackground(Color.LIGHT_GRAY);
        b8.setForeground(Color.BLUE);

        b9.setBounds(170,150,45,30);
        b9.setBackground(Color.LIGHT_GRAY);
        b9.setForeground(Color.BLUE);

        b4.setBounds(50,200,45,30);
        b4.setBackground(Color.LIGHT_GRAY);
        b4.setForeground(Color.BLUE);

        b5.setBounds(110,200,45,30);
        b5.setBackground(Color.LIGHT_GRAY);
        b5.setForeground(Color.BLUE);

        b6.setBounds(170,200,45,30);
        b6.setBackground(Color.LIGHT_GRAY);
        b6.setForeground(Color.BLUE);

        b1.setBounds(50,250,45,30);
        b1.setBackground(Color.LIGHT_GRAY);
        b1.setForeground(Color.BLUE);

        b2.setBounds(110,250,45,30);
        b2.setBackground(Color.LIGHT_GRAY);
        b2.setForeground(Color.BLUE);

        b3.setBounds(170,250,45,30);
        b3.setBackground(Color.LIGHT_GRAY);
        b3.setForeground(Color.BLUE);

        b10.setBounds(110,300,45,30);
        b10.setBackground(Color.LIGHT_GRAY);
        b10.setForeground(Color.BLUE);

        b17.setBounds(170,300,45,30);
        b17.setBackground(Color.LIGHT_GRAY);
        b17.setForeground(Color.BLUE);

        b14.setBounds(230,150,45,30);
        b14.setBackground(Color.LIGHT_GRAY);
        b14.setForeground(Color.RED);

        b13.setBounds(230,200,45,30);
        b13.setBackground(Color.LIGHT_GRAY);
        b13.setForeground(Color.RED);

        b12.setBounds(230,250,45,30);
        b12.setBackground(Color.LIGHT_GRAY);
        b12.setForeground(Color.RED);

        b11.setBounds(230,300,45,30);
        b11.setBackground(Color.LIGHT_GRAY);
        b11.setForeground(Color.RED);

        b19.setBounds(170,100,100,30);
        b19.setBackground(Color.LIGHT_GRAY);
        b19.setForeground(Color.RED);

        b16.setBounds(290,100,45,30);
        b16.setBackground(Color.LIGHT_GRAY);
        b16.setForeground(Color.RED);

        b15.setBounds(290,150,45,30);
        b15.setBackground(Color.LIGHT_GRAY);
        b15.setForeground(Color.RED);

        b18.setBounds(290,200,45,130);
        b18.setBackground(Color.LIGHT_GRAY);
        b18.setForeground(Color.RED);


        

        tf1 = new JTextField();
        tf1.setBounds(50,50,285,30);
        tf1.setBackground(Color.BLUE);
        tf1.setForeground(Color.WHITE);

        f.add(tf1);
        f.add(b1);f.add(b2);f.add(b3);f.add(b4);f.add(b5);f.add(b6);f.add(b7);f.add(b8);f.add(b9);f.add(b10);f.add(b11);f.add(b12);f.add(b13);f.add(b14);f.add(b15);f.add(b16);f.add(b17);f.add(b18);f.add(b19);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String args[])
    {
        new Calculator();
    }
}
