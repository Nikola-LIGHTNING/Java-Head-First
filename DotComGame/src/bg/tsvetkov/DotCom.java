package bg.tsvetkov;

import java.util.ArrayList;

public class DotCom {
    private ArrayList<String> locationCells;
    private String name;
    
    public String checkYourself(String userInput) {
        String result = "miss";
        int index = locationCells.indexOf(userInput); 
        //if userInput is not in the list index will be -1
        if(index >= 0) {
            locationCells.remove(index);    
            if(locationCells.isEmpty() == true) {
                result = "kill";
                System.out.println("Nice! You sunk " + name + "!");
            } else {
                result = "hit";
            }
        }            
        
        System.out.println(result);
        return result;
    }
    public String getName() {
        return name;
    }
    public void setName(String newName) {
        name = newName;
    }
    public void setLocationCells(ArrayList<String> locations) {
        locationCells = locations;
    }
}
