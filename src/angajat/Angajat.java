package angajat;

public class Angajat {
    String name;
    double salary;

    public Angajat() {
    }

    public Angajat(String name) {
        this.name = name;
    }

    public Angajat(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showAngajat(){
        System.out.println("  Angajatul:: " + name);
    }
}
