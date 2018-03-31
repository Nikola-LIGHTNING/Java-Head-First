
package bg.tsvetkov;

public class DogTestDrive {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[3];
        dogs[0] = new Dog();
        dogs[1] = new Dog();
        dogs[2] = new Dog();
        
        dogs[0].name = "Kolio";
        dogs[0].setSize(70); 
        
        dogs[1].name = "Gery";
        dogs[1].setSize(30);
        
        dogs[2].name = "Petko";
        dogs[2].setSize(10);
        
        dogs[0].bark(1);
        dogs[1].bark(3);
        dogs[2].bark(5);
    }
}
