package bg.tsvetkov;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleGUI1 {
    private JFrame frame;
    private JLabel label;
    private int x = 0;
    private int y = 0;
    
    public static void main(String[] args) {
        SimpleGUI1 gui = new SimpleGUI1();    
        gui.go();       
    }
    public void go() {
        frame = new JFrame();   
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton colorButton = new JButton("Change circle color");        
        colorButton.addActionListener(new ColorListener());
        
        JButton labelButton = new JButton("Change label text");
        labelButton.addActionListener(new LabelListener());
        
        label = new JLabel("I'm a label!");
        
        MyDrawPanel drawPanel = new MyDrawPanel();
        
        frame.getContentPane().add(colorButton, BorderLayout.SOUTH);
        frame.getContentPane().add(drawPanel, BorderLayout.CENTER);
        frame.getContentPane().add(label, BorderLayout.WEST);
        frame.getContentPane().add(labelButton, BorderLayout.EAST);   
        
        frame.setSize(500, 500);
        frame.setVisible(true);
        
        for(int index = 0; index < 250; index++) {
            x++;
            y++;
            
            drawPanel.repaint();
            
            try {
                Thread.sleep(15);                
            } catch (Exception ex) {
            
            }
        }
    }
    
    class ColorListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {        
           frame.repaint();
        }
    }
    
    class LabelListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {        
            label.setText("Ouch!");
        }
    }
    
    public class MyDrawPanel extends JPanel {
        @Override
        public void paintComponent(Graphics g) {
            int red = (int) (Math.random() * 255);
            int green = (int) (Math.random() * 255);
            int blue = (int) (Math.random() * 255);
        
          //  g.fillRect(0, 0, this.getWidth(), this.getHeight());
        
            Color randomColor = new Color(red, green, blue);
            g.setColor(randomColor);
            g.fillOval(x, y, 70, 70);
    }
}
}
