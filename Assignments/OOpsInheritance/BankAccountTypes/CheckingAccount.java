class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    public CheckingAccount(int accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
    }

    public void displayDetails() {
        displayAccountInfo();
        System.out.println("Withdrawal Limit: " + withdrawalLimit);
    }
}