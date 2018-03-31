package bg.tsvetkov;

class BankAccount {
    private int balance = 100;
    
    public int getBalance() {
        return this.balance;        
    }
    
    public void withdraw(int amount) {
        balance -= amount;
    } 
    
    public BankAccount(int b) {
        this.balance = b;
    }
    public BankAccount() {
        
    }
}
