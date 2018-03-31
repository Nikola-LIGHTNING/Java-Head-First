package bg.tsvetkov;

public class Dog {
    String name;
    int size;
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Bart";
        
        Dog[] myDog = new Dog[3];
        myDog[0] = new Dog();
        myDog[1] = new Dog();
        myDog[2] = dog1;
        
        myDog[0].name = "Betty";
        myDog[1].name = "Kolio";
        
        System.out.println("Last dog's name is " + myDog[2].name);
        
        int x = 0;
        while(x < myDog.length) {
            myDog[x].bark();
            x = x + 1;
        }        
    }
    
    public void bark() {
        System.out.println(name + " says Ruff!");
    }
    
    public void eat() {
        
    }
    public void chaseCat() {
        
    }
}
