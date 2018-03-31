package bg.tsvetkov;

public abstract class Animal {
    int size = 0;
    private String name = null;    
    
    public Animal() {
    
    }
    public Animal(String newName) {
        name = newName;
    }
    
    public int getSize() {
        return size;        
    }
    public void setSize(int newSize) {
        size = newSize;
    }
    
    public String getName() {
        return name;        
    }
    public void setName(String newName) {
        name = newName;
    }    
    
    public void eat() {
    
    }
    public void sleep() {
        
    }
}
