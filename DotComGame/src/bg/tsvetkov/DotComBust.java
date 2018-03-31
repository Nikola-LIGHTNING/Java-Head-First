package bg.tsvetkov;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DotComBust {
    GameHelper helper = new GameHelper();
    ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
    int numOfGuesses = 0;
    
    public void setUpGame() {
        DotCom dot1 = new DotCom();
        DotCom dot2 = new DotCom();
        DotCom dot3 = new DotCom();
        
        dot1.setName("facebook.com");
        dot2.setName("reddit.com");
        dot3.setName("wikipedia.com");
        
        dotComList.add(dot1);
        dotComList.add(dot2);
        dotComList.add(dot3);
        
        System.out.println("Your goal is to sink the evil DotComs!");
        System.out.println("facebook.com, reddit.com, wikipedia.com");
        System.out.println("Try to sink them all in the fewest number of guesses!");
        
        for(DotCom dot : dotComList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dot.setLocationCells(newLocation);            
        }        
    }
    public void startPlaying() {
        while(!dotComList.isEmpty()) {
            String userGuess = helper.getUserInput("Enter a cell: ");
            checkUserGuess(userGuess);            
        }
    }
    public void checkUserGuess(String userGuess) {
        String result = "miss";
        numOfGuesses++;
        for(DotCom dot : dotComList) {
            result = dot.checkYourself(userGuess);
            if(result.equals("hit")) {
                break;
            }
            if(result.equals("kill")) {
                dotComList.remove(dot);
                break;
            }
        }
        
    }
    public void finishGame() {
        if(numOfGuesses > 10) {
            System.out.println("It only took you " + numOfGuesses + " number of guesses!");
            System.out.println("You better be good at something else, because you suck a this game!");
        } else {            
            System.out.println("It took you " + numOfGuesses + " number of guesses!");
            System.out.println("WOW! You're really good at this game!");
        }
    }
    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
        game.finishGame();
    }
}
