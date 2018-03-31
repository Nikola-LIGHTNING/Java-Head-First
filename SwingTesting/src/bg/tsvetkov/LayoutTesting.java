package bg.tsvetkov;

import java.awt.*;
import javax.swing.*;

public class LayoutTesting {
    public static void main(String[] args) {
        LayoutTesting gui = new LayoutTesting();
        gui.go();
    }
    public void go() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setBackground(Color.DARK_GRAY);        
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        
        JButton button = new JButton("click me");
        JButton buttonTwo = new JButton("bliss");
        JButton buttonThree = new JButton("huh?");
        
        panel.add(button);
        panel.add(buttonTwo);
        panel.add(buttonThree);
        
        frame.getContentPane().add(panel, BorderLayout.EAST);
        
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}
