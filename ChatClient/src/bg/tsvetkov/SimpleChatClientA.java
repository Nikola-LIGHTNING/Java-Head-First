package bg.tsvetkov;

import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

public class SimpleChatClientA {
    JTextField outgoing;
    JTextArea incoming;
    PrintWriter writer;
    BufferedReader reader;
    Socket sock;
    
    public static void main(String[] args) {
        new SimpleChatClientA().go();
    }
    
    public void go() {
        JFrame frame = new JFrame("Ludicrously Simple Chat Client");
        JPanel mainPanel = new JPanel();
        
        incoming = new JTextArea(15, 50);
        incoming.setLineWrap(true);
        incoming.setWrapStyleWord(true);
        incoming.setEditable(false);
        JScrollPane scroller = new JScrollPane(incoming);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        
        outgoing = new JTextField(20);        
        
        JButton sendButton = new JButton("Send");
        sendButton.addActionListener(new SendButtonListener());
        
        mainPanel.add(scroller);
        mainPanel.add(outgoing);
        mainPanel.add(sendButton);
        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        
        setUpNetworking();
        
        Thread readerThread = new Thread(new IncomingReader());
        readerThread.start();
        
        frame.setSize(400, 500);
        frame.setVisible(true);
        
    }
    
    private void setUpNetworking() {
        try {
            sock = new Socket("127.0.0.1", 5000); // testing on localhost
            writer = new PrintWriter(sock.getOutputStream());            
            reader = new BufferedReader(new InputStreamReader(sock.getInputStream()));
            System.out.println("Network Established");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    class SendButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            String text = outgoing.getText();
            try {
                writer.println(text);    
                writer.flush();
            } catch(Exception ex) {
                ex.printStackTrace();
            }
            outgoing.setText("");
            outgoing.requestFocus();            
        }
    }
    
    public class IncomingReader implements Runnable {
        @Override
        public void run() {
             String message;
             try {
                 while((message = reader.readLine()) != null) {
                     System.out.println("read " + message);
                     incoming.append(message + "\n");
                 }                 
             } catch (IOException ex) {
                 ex.printStackTrace();
             }
        }
    }
}
