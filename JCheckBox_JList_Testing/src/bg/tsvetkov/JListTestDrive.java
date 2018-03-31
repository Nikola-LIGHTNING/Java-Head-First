package bg.tsvetkov;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;


public class JListTestDrive implements ListSelectionListener {
    JList list;
    public static void main(String[] args) {
        JListTestDrive gui = new JListTestDrive();
        gui.go();
    }
    public void go() {       
        String[] listEntries = { 
            "Wazzap", "Alpha", "Beta", "Gamma", "Delta",
            "Epsilon", "Zeta", "Eta", "Theta", "Wazaaap" 
        };
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        
        list = new JList(listEntries);      
        list.setVisibleRowCount(4);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.addListSelectionListener(this);
        
        JScrollPane scroller = new JScrollPane(list);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        
        panel.add(scroller);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel, BorderLayout.NORTH);
        
        frame.setSize(400, 400);
        frame.setVisible(true);        
    }
    @Override
    public void valueChanged(ListSelectionEvent event) {
        if(!event.getValueIsAdjusting()) {
            String selection = (String) list.getSelectedValue();
            System.out.println(selection);
        }          
        
    }
}
