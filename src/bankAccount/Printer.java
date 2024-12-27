package bankAccount;

public class Printer {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Ion Popescu");

        bankAccount.showDetails();

        bankAccount.depozit(456.90);
        bankAccount.showDetails();
    }
}
