import java.awt.*;
import javax.swing.*;

import javax.swing.JFrame;

public class Alpolyline extends Canvas {
    public void paint(Graphics g) {
        // g.setColor(Color.cyan);
        int x[] = {30,50,70,90,110};
        int y[] = {50,30,50,70,50};
        g.drawPolyline(x, y, 5);

        int p[] = {150,100,100,200,200};
        int t[] = {100,150,200,200,150};
        g.drawPolygon(p, t, 5);
        g.setColor(Color.red);
        g.fillPolygon(p, t, 5);
    }

    static public void main(String... ak) {
        JFrame f1 = new JFrame("Graphics panel");
        f1.setSize(700, 700);

        Alpolyline ob1 = new Alpolyline();
        f1.add(ob1);
        
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLocationRelativeTo(null);
        f1.setVisible(true);
    }
}
