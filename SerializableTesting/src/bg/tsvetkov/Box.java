package bg.tsvetkov;

import java.io.*;

public class Box implements Serializable {
    private int width;
    private int height;
    
    public static void main(String[] args) {
        Box myBox = new Box();
        myBox.setWidth(50);
        myBox.setHeight(25);
        
        try {
            FileOutputStream fs = new FileOutputStream("Nikola.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(myBox);
            os.close();            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }    
    
    public void setWidth(int w) {
        width = w;        
    }
    public void setHeight(int h) {
        height = h;        
    }
}
