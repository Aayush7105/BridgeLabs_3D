class FixedDepositAccount extends BankAccount {
    int depositPeriod; 

    public FixedDepositAccount(int accountNumber, double balance, int depositPeriod) {
        super(accountNumber, balance);
        this.depositPeriod = depositPeriod;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }

    public void displayDetails() {
        displayAccountInfo();
        System.out.println("Deposit Period: " + depositPeriod + " months");
    }
}