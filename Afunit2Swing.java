import java.awt.BorderLayout;
import java.awt.*;
import java.awt.GridLayout;


// to close awt frame we need to use window listner
import javax.swing.*;

public class Afunit2Swing {

    public static void main(String [] ak) {
        JFrame f = new JFrame("AK");
        f.setSize(500, 400);
        f.setLocationRelativeTo(null); // centre to window
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // if we click on exit then it will close the program otherwise not.
        f.setResizable(false); // we can't resize the window 
        f.getContentPane().setBackground(Color.DARK_GRAY);
        f.getContentPane().setBackground(new Color(255, 065, 70, 100));
        
        
        
        
        JLabel msg = new JLabel("Copyright Reserver @ AK Vishwakarma");
        f.add(msg, BorderLayout.SOUTH);
        
        
        JTextField value = new JTextField(20);
        f.add(value, BorderLayout.NORTH);
        
        //Creating a JPanel for holding the Buttons
        
        GridLayout gl = new GridLayout(4,3,5,5); 
        /* 3rd and 4th argument is padding
           if we put 0,+ int 1st ans 2nd argument then 1st(row) is dynamic and 2nd is fixed
           if we put +,0 int 1st ans 2nd argument then 1st(row) is fixed and 2nd is dynamic
           if we put 0,+ int 1st ans 2nd argument then 1st(row) is dynamic and 2nd is fixed
           if we put +,- int 1st ans 2nd argument then 1st(row) is fixed and 2nd is dynamic
           if we put -,+ int 1st ans 2nd argument then 1st(row) is dynamic and 2nd is fixed
           f we put 0,0  then it will give an error illeagalargument exception
           if we put -,- then grid layout will be blank
        */
        JPanel p1 = new JPanel(gl);
        for(int i=9; i>=1; i--){
            p1.add(new JButton(" "+i));
        }
        p1.add(new JButton("."));
        p1.add(new JButton("0"));
        p1.add(new JButton("="));

        GridLayout g2 = new GridLayout(4,2,5,5);
        JPanel p2 = new JPanel(g2);
        p2.add(new JButton("/"));
        p2.add(new JButton("ON"));
        p2.add(new JButton("*"));
        p2.add(new JButton("OFF"));
        p2.add(new JButton("+"));
        p2.add(new JButton("AC"));
        p2.add(new JButton("-"));
        JButton b1  = new JButton("Submit");
        p2.add(b1);

        f.add(p1);
        f.add(p2,BorderLayout.EAST);
        f.setVisible(true);

    }
}