package bg.tsvetkov;

public class Dog extends Animal implements Pet {  
    public void bark(int numOfBarks) {
        while(numOfBarks > 0) {
            if(size > 70) {
                System.out.println("Woof!");
            } else if (size > 35) {
                System.out.println("Ruuuf!");
            } else {
                System.out.println("Bao Bao!");
            }                
        }
    }
    
    @Override
    public void beFriendly() {
        
    }
    @Override
    public void play() {
        
    }
}
