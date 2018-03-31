package bg.tsvetkov;

import java.io.*;

public class GameSaverTest {
    public static void main(String[] args) {
        GameCharacter one = new GameCharacter(50, "Elf", new String[] { "Bow", "Sword", "Dust"});
        GameCharacter two = new GameCharacter(200, "Troll", new String[] { "Axe", "Hammer", "Teeth"});
        GameCharacter three = new GameCharacter(120, "Human", new String[] { "Fists", "Sword", "Crossbow"});
        
        try {
            FileOutputStream fs = new FileOutputStream("tryhard.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(one);
            os.writeObject(two);
            os.writeObject(three);
            os.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        System.out.println("One's type: " + one.getType());
        System.out.println("Two's type: " + two.getType());
        System.out.println("Three's type: " + three.getType());
        
        one = null;
        two = null;
        three = null;
        
        try {
            FileInputStream fs = new FileInputStream("tryhard.ser");
            ObjectInputStream is = new ObjectInputStream(fs);
            one = (GameCharacter) is.readObject();
            two = (GameCharacter) is.readObject();
            three = (GameCharacter) is.readObject();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        System.out.println("Restored One's type: " + one.getType());
        System.out.println("Restored Two's type: " + two.getType());
        System.out.println("Restored Three's type: " + three.getWeapons());
    }
}
