package bg.tsvetkov;

import java.io.*;

public class GameCharacter implements Serializable {
    private int power;
    private String type;
    private String[] weapons;
    
    GameCharacter(int p, String t, String[] w) {
        power = p;
        type = t;
        weapons = w;
    }
    
    public int getPower() {
        return this.power;
    }
    public String getType() {
        return this.type;
    }
    public String getWeapons() {
        String weaponsAsString = "";
        for(int i = 0; i < weapons.length; i++) {
            weaponsAsString += weapons[i] + ", ";
        }
        return weaponsAsString;
    }
}
