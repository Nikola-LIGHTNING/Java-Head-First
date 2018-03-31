package bg.tsvetkov;



public class TestSync implements Runnable {
    private int balance;
    public static void main(String[] args) {
        TestSync theJob = new TestSync();
        Thread a = new Thread(theJob);
        Thread b = new Thread(theJob);
        a.start();
        b.start();
    }
    
    @Override
    public void run() {
        for(int x = 0; x < 50; x++) {
            increment();
            System.out.println("Balance: " + balance);
        }
    }
    private synchronized void increment() {
        int i = balance;
        balance = i + 1;
    }
}
