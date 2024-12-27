package angajat;

public class Printer {
    public static void main(String[] args) {
        Angajat angajat = new Angajat("  Ion Marari");
        Manager manager = new Manager(angajat.name,24000.45,"Data Science");
        Programator programator = new Programator(angajat.name, manager.salary, manager.departament, "SQL");
        angajat.showAngajat();
        manager.showDepartment();
        programator.showDetails();
    }
}
