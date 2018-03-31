package bg.tsvetkov;

public class RyanAndMonicaJob implements Runnable {
    private BankAccount account = new BankAccount();
    public static void main(String[] args) {
        RyanAndMonicaJob theJob = new RyanAndMonicaJob();
        Thread one = new Thread(theJob);
        Thread two = new Thread(theJob);
        one.setName("Ryan");
        two.setName("Monica");
        one.start();
        two.start();
    }
    
    @Override
    public void run() {
        for(int x = 0; x < 10; x++) {
            makeWithdraw(10);
            if(account.getBalance() < 0) {
                System.out.println("Overdrown!");            
            }
        }            
    }
    
    private synchronized void makeWithdraw(int amount) {        
        if(account.getBalance() > amount) {
            System.out.println(Thread.currentThread().getName() + " is going to withdraw");
            try {
                System.out.println(Thread.currentThread().getName() + " is going to sleep");
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " woke up!");
            account.withdraw(amount);
            System.out.println(Thread.currentThread().getName() + " has withdrawn");
        } else {
            System.out.println("Not enough money in your account. Sorry, " + Thread.currentThread().getName());
        }            
    }
    
}
