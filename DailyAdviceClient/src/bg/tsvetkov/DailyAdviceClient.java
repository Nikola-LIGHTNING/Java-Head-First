package bg.tsvetkov;

import java.io.*;
import java.net.*;

public class DailyAdviceClient {
    public static void main(String[] args) {         
        DailyAdviceClient dailyAdvice = new DailyAdviceClient();
        dailyAdvice.go();
    }
    
    public void go () {
        try {
            Socket s = new Socket("127.0.0.1", 4243);
            InputStreamReader streamReader = new InputStreamReader(s.getInputStream());
            BufferedReader reader = new BufferedReader(streamReader);
            
            String advice = reader.readLine();
            System.out.println("Advice message: " + advice);
            
            reader.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
