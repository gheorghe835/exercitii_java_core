package angajat;

public class Programator extends Manager{
    String languageProgramming;


    public Programator(String departament, String languageProgramming) {
        super(departament);
        this.languageProgramming = languageProgramming;
    }

    public Programator(String name, double salary, String departament, String languageProgramming) {
        super(name, salary, departament);
        this.languageProgramming = languageProgramming;
    }

    public void showLanguageProgramming(){
        System.out.println("  Limbajul de programare:: " + languageProgramming);
    }

    public void showDetails(){
        System.out.println("  Angajatul:: " + name + ", din departamentul:: " + departament + ", duce limbajul de programare:: " +
                languageProgramming + ", are un salariu de:: " + salary + " lei");
    }
}
