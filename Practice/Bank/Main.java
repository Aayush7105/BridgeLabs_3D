import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IBankService bankService = new BankServiceImp();

        // Step 1: Pehle ek User banao
        System.out.print("Enter User Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Aadhaar Number: ");
        long aadhaar = sc.nextLong();
        sc.nextLine(); // buffer clear

        System.out.print("Enter Address: ");
        String address = sc.nextLine();

        // User create
        User user = new User(name, age, aadhaar, address);

        // Step 2: Account banao
        System.out.print("Enter Account Number: ");
        long accNo = sc.nextLong();

        System.out.print("Enter Initial Balance: ");
        double initialBalance = sc.nextDouble();

        Bank account = new Bank(accNo, user, initialBalance);

        // Step 3: Menu
        int choice;
        do {
            System.out.println("\n=== BANK MENU ===");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Show Account Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double dAmount = sc.nextDouble();
                    bankService.deposit(account, dAmount);
                    break;

                case 2:
                    System.out.print("Enter withdraw amount: ");
                    double wAmount = sc.nextDouble();
                    bankService.withdraw(account, wAmount);
                    break;

                case 3:
                    bankService.checkBalance(account);
                    break;

                case 4:
                    System.out.println(account);
                    break;

                case 5:
                    System.out.println("Thank you for using our Bank System!");
                    break;

                default:
                    System.out.println("Invalid choice, please try again!");
            }

        } while (choice != 5);

        sc.close();
    }
}