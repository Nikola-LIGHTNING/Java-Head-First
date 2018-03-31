package bg.tsvetkov;

import javax.swing.*;
import java.awt.*;

public class MyDrawPanel extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
       // g.setColor(Color.orange);
       // g.fillRect(20, 50, 100, 100);
       /*
       Image image = new ImageIcon("lul.jpg").getImage();
       g.drawImage(image, 10, 10, this);
       */
       /*
       g.fillRect(0, 0, this.getWidth(), this.getHeight());
       Graphics2D g2d = (Graphics2D) g;
       
       int red = (int) (Math.random() * 255);
       int green = (int) (Math.random() * 255);
       int blue = (int) (Math.random() * 255);
       
       Color randomColor = new Color(red, green, blue);
       //g.setColor(randomColor);
       //g.fillOval(200, 200, 100, 100);
       
       g2d.setColor(randomColor);
       g2d.draw3DRect(50, 50, 100, 100, true);
       g2d.fill3DRect(50, 50, 100, 100, true);
       */
       Graphics2D g2d = (Graphics2D) g;
       
       int red = (int) (Math.random() * 255);
       int green = (int) (Math.random() * 255);
       int blue = (int) (Math.random() * 255);       
       Color startColor = new Color(red, green, blue);
       
       red = (int) (Math.random() * 255);
       green = (int) (Math.random() * 255);
       blue = (int) (Math.random() * 255);       
       Color endColor = new Color(red, green, blue);
       
       GradientPaint gradient = new GradientPaint(70, 70, startColor, 150, 150, endColor);
       g2d.setPaint(gradient);
       g2d.fillOval(70, 70, 100, 100);
       
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        MyDrawPanel canvas = new MyDrawPanel();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(canvas);
        frame.setSize(400, 400);
        frame.setVisible(true);
        
    }
}
