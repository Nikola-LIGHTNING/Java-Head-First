/*package bg.tsvetkov;

import java.awt.*;
import javax.swing.*;
import javax.sound.midi.*;

public class MyDrawPanel extends JPanel implements ControllerEventListener {
    boolean msg = false;
    
    @Override
    public void controlChange(ShortMessage event) {
        msg = true;
        repaint();
    }
    
    @Override
    public void paintComponent(Graphics g) {
        if(msg) {
            Graphics2D g2 = (Graphics2D) g;
            
            int red = (int) (Math.random() * 255);
            int green = (int) (Math.random() * 255);
            int blue = (int) (Math.random() * 255);
            
            g.setColor(new Color(red, green, blue));
            
            int height = (int) (Math.random() * 120 + 10);
            int width = (int) (Math.random() * 120 + 10);
            int x = (int) (Math.random() * 40 + 10);
            int y = (int) (Math.random() * 40 + 10);
            g.fillRect(x, y, height, width);
            msg = false;
        }
    }
    
}
*/