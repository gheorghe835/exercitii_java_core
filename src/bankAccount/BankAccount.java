package bankAccount;

public class BankAccount {
    public String nameClient;
    private double sold;

    public BankAccount(String nameClient) {
        this.nameClient = nameClient;
        this.sold = 0;
    }

    public double depozit(double summ){
        if (summ > 0){
            sold += summ;
            System.out.println("  Persoana:: " + nameClient + ", a depus:: " + summ + " lei. Soldul actual:: " + sold);
        }
        else System.out.println("  Suma depusa trebuie sa fie mai mare de 0 !!!");
        return summ;
    }

    public void showDetails(){
        System.out.println("  Persoana:: " + nameClient + ". Soldul actual:: " + sold + " lei.");
    }
}
