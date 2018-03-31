package bg.tsvetkov;

public class Cat extends Animal implements Pet {    
    public void meow(int numOfMeows) {
        while(numOfMeows > 0) {
            if(size > 70) {
                System.out.println("MIAOW!");
            } else if (size > 35) {
                System.out.println("Meow!");
            } else {
                System.out.println("me-ow!");
            }                
        }
    }
    
    public Cat() {
        
    }
    public Cat(String newName) {
        super(newName);
    }
    
    @Override
    public void beFriendly() {
        
    }
    @Override
    public void play() {
    
    }
}
