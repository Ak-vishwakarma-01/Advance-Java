import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.*;
import java.util.Scanner;

import javax.management.ValueExp;
import javax.swing.*;

public class Ahtictactoe {
    
    
    static JButton[] arr = new JButton[9];
    static boolean x = true;
    static int counter = 0;
    static public void main(String... ak) {    
        
        JFrame f = new JFrame("Khelo India");
        f.setSize(700, 700);
        f.getContentPane().setBackground(new Color(0, 0, 255, 20));
        f.setLocationRelativeTo(null);
        // f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel msg = new JLabel("Copyright Reserved @ AK Vishwakarma");
        f.add(msg, BorderLayout.SOUTH);

        // Creating a JPanel for holding the Buttons
        JTextField value = new JTextField(20);
        f.add(value, BorderLayout.NORTH);

        GridLayout gl = new GridLayout(3, 3, 3, 3);
        JPanel p = new JPanel(gl);
        
        for (int i = 0; i < 9; i++) {
            JButton b = new JButton();
            b.setFont(new Font("Serif",1,50));
            b.setForeground(Color.RED);
            
            
            p.add(b);
            arr[i] = b;
        }
        f.add(p);

        
        class Lelistener implements ActionListener {
            
            public void actionPerformed(ActionEvent ae) {
                
                counter++;
                JButton b = (JButton) ae.getSource();
                if (Ahtictactoe.x)
                    b.setLabel("X");
                else
                    b.setLabel("O");
                Ahtictactoe.x = !Ahtictactoe.x;
                b.setEnabled(false);// we can,t click on that button again

                if((arr[0].getText()=="X" && arr[1].getText()=="X" && arr[2].getText()=="X") || (arr[0].getText()=="X" && arr[4].getText()=="X" && arr[8].getText()=="X") 
                || (arr[0].getText()=="X" && arr[3].getText()=="X" && arr[6].getText()=="X") || (arr[6].getText()=="X" && arr[7].getText()=="X" && arr[8].getText()=="X") 
                || (arr[2].getText()=="X" && arr[4].getText()=="X" && arr[6].getText()=="X") || (arr[8].getText()=="X" && arr[5].getText()=="X" && arr[2].getText()=="X")){
                    value.setText("X Won");
                    
                    // JOptionPane.showMessageDialog(frame, buttons[2].getText() + " wins!");  we can alos use this but it will show only ok not yes or no
                    int choice = JOptionPane.showOptionDialog(f, "Player X wins! Play again?", "Game Over", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                    // here "Game over is the Title of the box and JOptionPane.QUESTION_MESSAGE will give a ? bfore the messege on this dailoge box which we are passing"
                    value.setText("Player X wins last time ");
                    //The JOptionPane is used to display a dialog box with a message to the user. In the provided code snippet
                
                    if (choice == JOptionPane.YES_OPTION) {
                        resetBoard();
                        counter = 0;
                        return;
                    } else {
                        // f.dispose(); it is used to close that frame
                        System.exit(0); 
                    }
                }else if((arr[0].getText()=="O" && arr[1].getText()=="O" && arr[2].getText()=="O") || (arr[0].getText()=="O" && arr[4].getText()=="O" && arr[8].getText()=="O") 
                || (arr[0].getText()=="O" && arr[3].getText()=="O" && arr[6].getText()=="O") || (arr[6].getText()=="O" && arr[7].getText()=="O" && arr[8].getText()=="O") 
                || (arr[2].getText()=="O" && arr[4].getText()=="O" && arr[6].getText()=="O") || (arr[8].getText()=="O" && arr[5].getText()=="O" && arr[2].getText()=="O")){
                    value.setText("O Won");
                    
                    value.setText("Player O wins last time ");
                    int choice = JOptionPane.showOptionDialog(f, "Player O wins! Play again?", "Game Over", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                    
                    if (choice == JOptionPane.YES_OPTION) {
                        resetBoard();
                        counter  = 0;
                        return;
                    } else {
                        System.exit(0); 
                    }
                }else if(counter==9){
                    JOptionPane.showMessageDialog(f, "Match Drawan no one win");
                    resetBoard();
                    value.setText("The Last Match was drawn");
                    counter = 0;
                }
            }
        }
        /*
        jb.addActionListener(m) is used to add an ActionListener to each JButton jb. This line of code is adding an 
        instance of the Lelistener class (which implements the ActionListener interface) as the ActionListener for each JButton.
        addActionListener() is a method provided by the AbstractButton class, which JButton extends. It allows you to register an 
        ActionListener to receive action events when the button is clicked.
        So, in essence, jb.addActionListener(m) is instructing each JButton jb to notify the Lelistener instance m whenever the button is clicked. 
        This is achieved through the actionPerformed() method of the Lelistener class, where the logic to handle button clicks is implemented.
         */
        Lelistener m = new Lelistener();
        for (JButton jb : arr){
            jb.addActionListener(m);
        }

        f.setVisible(true);

        

        
    }
    static void resetBoard(){
        for(JButton jb: arr){
            jb.setText("");
            jb.setEnabled(true); // it makes the button clickable
        }
        x = true;
    }
}

