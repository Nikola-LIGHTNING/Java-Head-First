package bg.tsvetkov;

import java.util.ArrayList;

public class SimpleDotComGame {
    public static void main(String[] args) {
        SimpleDotCom theDotCom = new SimpleDotCom();
        GameHelper helper = new GameHelper();
        ArrayList<String> locations = new ArrayList<>();
        int numOfGuesses = 0;      
        
        int firstLocation;        
        firstLocation = (int) (Math.random() * 5);
        
        locations.add(Integer.toString(firstLocation));
        locations.add(Integer.toString(firstLocation + 1));
        locations.add(Integer.toString(firstLocation + 2));
        
        theDotCom.setLocationCells(locations);        
        
        boolean isAlive = true;
        while(isAlive == true) {
            String guess = helper.getUserInput("Enter a number: ");            
            String result = theDotCom.checkYourself(guess);
            numOfGuesses++;
            if(result.equals("kill")) {
                isAlive = false;
                System.out.println("Number of guesses: " + numOfGuesses);
            }            
        }                
    }
}
