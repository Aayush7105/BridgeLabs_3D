import java.util.ArrayList;
import java.util.List;

public class BankingSystem {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();

        SavingsAccount sa = new SavingsAccount("SA001", "Alice", 2000, 0.04);
        CurrentAccount ca = new CurrentAccount("CA001", "Bob", 7000, 0.02);

        accounts.add(sa);
        accounts.add(ca);

        for (BankAccount account : accounts) {
            account.displayAccount();
            System.out.println("Interest: " + account.calculateInterest());

            if (account instanceof Loanable) {
                Loanable loanable = (Loanable) account;
                loanable.applyForLoan(5000);
            }

            System.out.println("----------------------------");
        }
    }
}
