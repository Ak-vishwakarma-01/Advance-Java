
import java.awt.*;
import javax.swing.*;

import javax.swing.JFrame;

public class Akgraphicsflag extends Canvas {
    public void paint(Graphics g) {
        // g.setColor(Color.cyan);
        g.drawString("Le bhaiyaa company bn gya jhanda**", 50, 100);
        g.drawRect(50, 120, 300, 200);
        g.setColor(new Color(0,255,0));
        g.fillRect(50, 120, 300, 200);

        g.drawOval(120, 153, 150, 150);
        g.setColor(Color.red);
        g.fillOval(120, 153, 150, 150);
    }

    static public void main(String... ak) {
        JFrame f1 = new JFrame("Graphics panel");
        f1.setSize(700, 700);

        Akgraphicsflag ob1 = new Akgraphicsflag();
        f1.add(ob1);
        
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLocationRelativeTo(null);
        f1.setVisible(true);
    }
}
