import java.awt.Canvas;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;


public class AnMenu extends Canvas {
    public static void  main(String []ak){
        JFrame f1 = new JFrame();
        f1.setSize(600, 600);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLocationRelativeTo(null); // it will set the frame at the centre
        f1.getContentPane().setBackground(Color.blue);
        
        JTextArea txt = new JTextArea("le bhaiya text area", 10, 5);
        f1.add(txt);
        
        JMenu subMenu1 = new JMenu("File");
        JMenu subMenu2 = new JMenu("Edit");
        
        JMenuItem mi1 = new JMenuItem("Cut");                            subMenu2.add(mi1); 
        JMenuItem mi2 = new JMenuItem("Copy");                           subMenu2.add(mi2); 
        JCheckBoxMenuItem mi3 = new JCheckBoxMenuItem("Paste",true);     subMenu2.add(mi3);
        
        subMenu2.insertSeparator(2); // seperator is also holds a index


        JMenu m1 = new JMenu("section");
        m1.add(subMenu1);   m1.add(subMenu2);
        
        
        JMenuBar mb1 = new JMenuBar();
        mb1.add(m1);
        
        f1.setJMenuBar(mb1);
        
        f1.setVisible(true);
        
        
        class MyListener implements ActionListener{
            public void actionPerformed(ActionEvent e){
                if(e.getSource()== subMenu2 ) System.out.println("Meny");
                if(e.getSource()== mi3){
                    JFileChooser fc = new JFileChooser("D:");
                    fc.showOpenDialog(f1);
                    fc.showSaveDialog(txt);
                }
            }
        }
        
        
        MyListener ob1 = new MyListener();
        mi3.addActionListener(ob1);
        
    }    
}
