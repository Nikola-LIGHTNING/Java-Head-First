package bg.tsvetkov;

import java.util.*;

public class TestMap {
    public static void main(String[] args) {
        HashMap<String, Integer> scores = new HashMap<String, Integer>();
        // HashMap needs to type parameters. 
        // One for the KEY and one for the VALUE.
        
        // HashMap uses put instead of add and takes two arguments
        scores.put("Kathy", 42);
        scores.put("Bert", 343);
        scores.put("Skyler", 420);
        
        System.out.println(scores);
        System.out.println(scores.get("Bert")); 
        // the get method takes a key and returns a value
        
    }
}
