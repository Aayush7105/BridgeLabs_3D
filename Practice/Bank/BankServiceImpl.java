public class BankServiceImpl implements IBankService {

    @Override
    public void deposit(Bank bank, double amount) {
        bank.deposit(amount);
    }

    @Override
    public void withdraw(Bank bank, double amount) {
        bank.withdraw(amount);
    }

    @Override
    public double getBalance(Bank bank) {
        return bank.getBalance();
    }
}