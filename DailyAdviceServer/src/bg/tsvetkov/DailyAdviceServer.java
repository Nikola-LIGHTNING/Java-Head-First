package bg.tsvetkov;

import java.io.*;
import java.net.*;

public class DailyAdviceServer {
    String[] advice = {"Be a good person", "Do the right thigns",
        "Work hard", "Study", "Do some good for humanity", 
        "Think about the meaning of life and act accordingly!" };
    public static void main(String[] args) {
        DailyAdviceServer server = new DailyAdviceServer();
        server.go();
    }
    
    public void go() {
        try {
            ServerSocket serverSock = new ServerSocket(4243);
            // ServerSocket makes this server application listen 
            // for client requests to 4243
            // on the machine this code is running on
            
            // Permanent loop while waiting for a client request
            while(true) {
                Socket sock = serverSock.accept();
                
                PrintWriter writer = new PrintWriter(sock.getOutputStream());
                String advice = getAdvice();
                writer.println(advice);
                writer.close();
                System.out.println(advice);                
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
    private String getAdvice() {
        int rand = (int) (Math.random() * advice.length);
        return advice[rand];
    }
}
