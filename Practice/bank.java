class BankAccount {
    int acc;
    String nm;
    double bal;

    BankAccount(int account, String name, double balance) {
        acc = account;
        nm = name;
        bal = balance;
    }

    void deposit(double c){
        this.bal = this.bal+c;
    }
     void withdraw(double c){
        this.bal = this.bal-c;
    }
    void rename(String rename){
        this.nm = rename;
    }

    void display() {
        System.out.println("Account number: " + acc + ", Name: " + nm + ", Balance: " + bal);
    }

    
}
public class bank{
    public static void main(String args[]) {
        BankAccount c1 = new BankAccount(1, "Aman", 10000.0);
        BankAccount c2 = new BankAccount(2, "Aayush", 1200.0);
        c1.deposit(100);
        c2.withdraw(500);
        c1.display();
        System.out.println("Rename :");
        c1.rename("Jatin");
        c1.display();
        c2.display();
    }
}

