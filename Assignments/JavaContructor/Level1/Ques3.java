// Ques3.java
class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);  
        System.out.println("Account Holder: " + accountHolder); 
        System.out.println("Balance: $" + getBalance());       
    }
}

public class Ques3 {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("ACC12345", "John Doe", 5000.00);
        sa.displayAccountDetails();
        System.out.println();
        sa.setBalance(5500.00);
        System.out.println("After updating balance:");
        sa.displayAccountDetails();
    }
}
