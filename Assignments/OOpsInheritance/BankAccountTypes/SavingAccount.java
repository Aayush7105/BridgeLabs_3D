class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
    }

    public void displayDetails() {
        displayAccountInfo();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
