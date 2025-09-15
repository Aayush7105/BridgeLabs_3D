interface IBankService {
    void deposit(Bank account, double amount);
    void withdraw(Bank account, double amount);
    void checkBalance(Bank account);
}