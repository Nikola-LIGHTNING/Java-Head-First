package bg.tsvetkov;

public class AnimalListTestDrive {
    public static void main(String[] args) {
        AnimalList animalList = new AnimalList();
        Dog d = new Dog();
        Cat c = new Cat();        
        
        animalList.add(d);
        animalList.add(c);
        
    }
}
