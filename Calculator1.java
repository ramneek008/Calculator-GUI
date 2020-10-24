import javax.swing.*;
import java.awt.event.*;

public class Calculator1 implements ActionListener{
    JFrame f;
    JTextField tf1;
    JButton b1, b2, b3, b4, b5;
    String st1,st2,st3,op;
    Calculator1(){
        f = new JFrame("Calculator");
        tf1 = new JTextField();
        tf1.setBounds(100,80,180,30);

        b1 = new JButton("+");
        b1.setBounds(120,150,50,30);
        b1.addActionListener(this);

        b2 = new JButton("-");
        b2.setBounds(200,150,50,30);
        b2.addActionListener(this);

        b3 = new JButton("*");
        b3.setBounds(120,200,50,30);
        b3.addActionListener(this);

        b4 = new JButton("/");
        b4.setBounds(200,200,50,30);
        b4.addActionListener(this);

        b5 = new JButton("=");
        b5.setBounds(150,250,70,30);
        b5.addActionListener(this);

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

    public void actionPerformed(ActionEvent e){
        
        if(e.getSource() == b1){
            st1 = tf1.getText();
            tf1.setText("");
            op = "+";
        }
        else if(e.getSource() == b2){
            st1 = tf1.getText();
            tf1.setText("");
            op = "-";
        }
        else if(e.getSource() == b3){
            st1 = tf1.getText();
            tf1.setText("");
            op = "*";
        }
        else if(e.getSource() == b4){
            st1 = tf1.getText();
            tf1.setText("");
            op = "/";
        }
        
        if(e.getSource()==b5){
            st2 = tf1.getText();
            int a = Integer.parseInt(st1);
            int b = Integer.parseInt(st2);
            int c=0;
            switch(op){
                case "+":
                    c=a+b;
                    st3 = String.valueOf(c);
                    tf1.setText(st3);
                    break;
                case "-":
                    c=a-b;
                    st3 = String.valueOf(c);
                    tf1.setText(st3);
                    break;
                case "*":
                    c=a*b;
                    st3 = String.valueOf(c);
                    tf1.setText(st3);
                    break;
                case "/":
                    if(b!=0)
                    {
                        c=a/b;
                        st3 = String.valueOf(c);
                    }
                    else
                    st3="Not Defined";
                    tf1.setText(st3);
                    break;
            }
            System.out.println(a + " " + op + " " + b + " = " + c);
        }
        
    }

    public static void main(String args[]){
        new Calculator1();
    }
}
