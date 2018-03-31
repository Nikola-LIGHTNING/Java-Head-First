package bg.tsvetkov;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class TextArea1 implements ActionListener {
    JTextArea text;
    public static void main(String[] args) {
        TextArea1 gui = new TextArea1();
        gui.go();
    }
    public void go() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();        
        
        JButton button = new JButton("Just click it!");        
        button.addActionListener(this);        
              
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
        text = new JTextArea(10, 20);
        text.setLineWrap(true);        
        
        JScrollPane scroller = new JScrollPane(text);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        
        panel.add(scroller);
        // Add the scroller with the text because we put the text field in the scroller constructor
        
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.getContentPane().add(button, BorderLayout.SOUTH);
        
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent event) {
        text.append("button clicked\n");
    }
}
