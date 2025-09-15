public class BankSystem {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(1001, 5000.0, 4.5);
        CheckingAccount ca = new CheckingAccount(1002, 10000.0, 2000.0);
        FixedDepositAccount fda = new FixedDepositAccount(1003, 20000.0, 12);

        System.out.println("=== Savings Account ===");
        sa.displayAccountType();
        sa.displayDetails();

        System.out.println("\n=== Checking Account ===");
        ca.displayAccountType();
        ca.displayDetails();

        System.out.println("\n=== Fixed Deposit Account ===");
        fda.displayAccountType();
        fda.displayDetails();
    }
}