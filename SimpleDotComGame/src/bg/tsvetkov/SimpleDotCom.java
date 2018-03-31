package bg.tsvetkov;

import java.util.*;

public class SimpleDotCom {
    private ArrayList<String> locationCells;
   
    
    public String checkYourself(String userInput) {
        String result = "miss";
        int index = locationCells.indexOf(userInput); 
        //if userInput is not in the list index will be -1
        if(index >= 0) {
            locationCells.remove(index);    
            if(locationCells.isEmpty() == true) {
                result = "kill";
            } else {
                result = "hit";
            }
        }            
        
        System.out.println(result);
        return result;
    }
    public void setLocationCells(ArrayList<String> locations) {
        locationCells = locations;
    }
    
}
