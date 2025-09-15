public class Bank {
    private long accountNumber;
    private User accountHolder;   // 👈 Link to User
    private double balance;

    // Constructor
    public Bank(long accountNumber, User accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getters & Setters
    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public User getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(User accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "accountNumber=" + accountNumber +
                ", accountHolder=" + accountHolder +
                ", balance=" + balance +
                '}';
    }
}