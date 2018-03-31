package bg.tsvetkov;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class JCheckBoxTestDrive implements ItemListener {
    JCheckBox check;
    public static void main(String[] args) {
        JCheckBoxTestDrive gui = new JCheckBoxTestDrive();
        gui.go();
    }
    public void go() {
        JFrame frame = new JFrame();
        check = new JCheckBox("Goest to 11");        
        check.addItemListener(this);
        check.setSelected(false);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(check, BorderLayout.NORTH);
        
        frame.setSize(400, 400);
        frame.setVisible(true);        
    }
    @Override
    public void itemStateChanged(ItemEvent event) {
        String onOrOff = "off";
        if(check.isSelected())
            onOrOff = "on";
        System.out.println("Check box is " + onOrOff);
    }
}
