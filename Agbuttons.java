import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

public class Agbuttons{

    public static void main(String [] ak){
        JFrame f = new JFrame("AK");
        f.setSize(500, 400);
        f.setLocationRelativeTo(null); // centre to window
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // if we click on exit then it will close the program otherwise not.
        f.setResizable(false); // we can't resize the window 
        f.getContentPane().setBackground(Color.DARK_GRAY);
        f.getContentPane().setBackground(new Color(255, 065, 70, 100));
        
        JButton b1  = new JButton("Submit");
        f.add(b1); 

        JLabel msg = new JLabel("Copyright Reserver @ AK Vishwakarma");
        f.add(msg, BorderLayout.SOUTH);
        
        JTextField value = new JTextField(20);
        f.add(value,BorderLayout.NORTH);

        GridLayout g1 = new GridLayout(4,3,5,5); 
        
        JPanel p1 = new JPanel(g1);
        for(int i=9; i>=1; i--){
            p1.add(new JButton(" "+i));
        }
        p1.add(new JButton("."));
        p1.add(new JButton("0"));
        p1.add(new JButton("="));

        JToggleButton p2 = new JToggleButton("ON");
        f.add(p1);
        f.add(p2,BorderLayout.EAST);
      
        f.setVisible(true);

    }
}