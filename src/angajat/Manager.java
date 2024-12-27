package angajat;

public class Manager extends Angajat{
    String departament;

    public Manager(String departament) {
        this.departament = departament;
    }

    public Manager(String name, double salary, String departament) {
        super(name, salary);
        this.departament = departament;
    }

    public void showDepartment(){
        System.out.println("  Persoana :: " + name +", din departamentul:: " + departament +
                ", are un salariu:: " + salary + " lei");
    }
     public void department(){
        System.out.println("  Departamentul:: " + departament);
     }
}
