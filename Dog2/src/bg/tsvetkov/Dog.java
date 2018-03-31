package bg.tsvetkov;

public class Dog {
    private int size;   // encapsulation - protecting instance variables from inappropriate values
    String name;    
    
    int getSize() {
        return size;
    }
    void setSize(int newSize) {
        if(newSize > 7) {
            size = newSize;
        }
    }    
    
    void bark(int numOfBarks)
    {
        while(numOfBarks > 0){
            if(size > 60) {
                System.out.println("Woof! Woof!");
            } else if (size > 14) {
                System.out.println("Ruff! Ruff!");           
            } else {
                System.out.println("Yip! Yip!");
            }      
            numOfBarks = numOfBarks - 1;
        }
    }
}
