public class BankServiceImp implements IBankService {

    @Override
    public void deposit(Bank account, double amount) {
        if (amount > 0) {
            account.setBalance(account.getBalance() + amount);
            System.out.println("Deposited " + amount + " into Account " + account.getAccountNumber());
            System.out.println("New Balance: " + account.getBalance());
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    @Override
    public void withdraw(Bank account, double amount) {
        if (amount > 0 && account.getBalance() >= amount) {
            account.setBalance(account.getBalance() - amount);
            System.out.println("Withdrawn " + amount + " from Account " + account.getAccountNumber());
            System.out.println("New Balance: " + account.getBalance());
        } else {
            System.out.println("Insufficient Balance or Invalid Amount!");
        }
    }

    @Override
    public void checkBalance(Bank account) {
        
        System.out.println(account.getAccountHolder().getUserName() + 
                           "'s Current Balance = " + account.getBalance());
    }
}