package bg.tsvetkov;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        go();
    }
    public void go() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        doMore();
    }
    
    public void doMore() {
        System.out.println("top of stack");
    }
    
}
