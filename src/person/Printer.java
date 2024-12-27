package person;

public class Printer {
    public static void main(String[] args) {
        Person person = new Person("Ion",34,"str.Florilor 12");
        System.out.println("  Persoana:: " + person.name);
        System.out.println("  Virsta::" + person.getVirsta());
        System.out.println("  Adresa:: " + person.getAddreess());

        person.setVirsta(36);
        person.setAddreess("str.Florilor 121");

        System.out.println("  Modificarea virstei pentru:: " + person.name + " in:: " + person.getVirsta());
        System.out.println("  Modificarea adresei pentru:: " + person.name + " in:: " + person.getAddreess());

        System.out.println("  Dupa modificari:: ");
        System.out.println("  Persoana:: " + person.name);
        System.out.println("  Virsta::" + person.getVirsta());
        System.out.println("  Adresa:: " + person.getAddreess());
    }
}
