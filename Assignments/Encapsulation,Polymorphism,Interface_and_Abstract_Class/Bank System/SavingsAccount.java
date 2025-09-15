public class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate;
    private String loanAccountId;

    public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate;
    }

    @Override
    public void applyForLoan(double amount) {
        if (calculateLoanEligibility()) {
            loanAccountId = "LOAN-" + getAccountNumber();
            System.out.println("Loan approved for " + amount + ". Loan Account ID: " + loanAccountId);
        } else {
            System.out.println("Loan not approved due to insufficient balance.");
        }
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 1000;
    }

    public String getLoanAccountId() {
        return loanAccountId;
    }
}
