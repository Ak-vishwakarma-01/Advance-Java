import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.*;
import java.util.Scanner;

import javax.management.ValueExp;
import javax.swing.*;

// Make from for slecting sport
public class Aiform {
    static public void main(String ... ak){

        JFrame f = new JFrame("Khelo India");
        f.setSize(700, 700);
        f.getContentPane().setBackground(new Color(0, 0, 255, 20));
        f.setLocationRelativeTo(null);
        // f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        JPanel p1 = new JPanel(null);
        JTextField t1 = new JTextField();
        // t1.setLayout(null);
        t1.setBounds(150,50,400,100);
        p1.add(t1);

        JTextField t2 = new JTextField();
        t2.setLayout(null);
        t2.setBounds(150,200,400,100);
        p1.add(t2);

        
        JLabel l1 = new JLabel("Gender");
        l1.setBounds(150,300,400,100);
        l1.setFont(new Font("serif",2,30));
        p1.add(l1);
        
        
        JRadioButton j1 = new JRadioButton("Male");
        j1.setBounds(250,300,100,100);
        j1.setFont(new Font("serif",2,20));
        p1.add(j1);
        

        JRadioButton j2 = new JRadioButton("female");
        j2.setBounds(350,300,400,100);
        j2.setFont(new Font("serif",2,20));
        p1.add(j2);
        

        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(j1); bg1.add(j2);
        
        f.add(p1);
        f.setVisible(true);
    }    
}