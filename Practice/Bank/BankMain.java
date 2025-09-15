public class BankMain {

    public static void main(String[] args) {
        Bank bank = new Bank(1001, "John Doe", 5000.0);
        BankServiceImpl service = new BankServiceImpl();

        System.out.println("Initial Details: " + bank);
        service.deposit(bank, 1500.0);
        System.out.println("After deposit: " + bank);
        service.withdraw(bank, 2000.0);
        System.out.println("After withdrawal: " + bank);
        System.out.println("Current Balance: " + service.getBalance(bank));
    }
}