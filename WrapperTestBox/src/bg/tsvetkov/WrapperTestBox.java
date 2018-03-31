package bg.tsvetkov;

public class WrapperTestBox {
    Integer i;
    int j;
    public static void main(String[] args) {
        WrapperTestBox testInstance = new WrapperTestBox();
        testInstance.go();
    }
    
    public void go() {
        j = i;
        System.out.println("Value of i: " + i);
        System.out.println("Value of j: " + j);
    }
}
