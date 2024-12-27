package person;

public class Person {
    public String name;
    private int virsta;
    protected String addreess;

    public Person(String name, int virsta, String addreess) {
        this.name = name;
        this.virsta = virsta;
        this.addreess = addreess;
    }

    public int getVirsta() {
        return virsta;
    }

    public void setVirsta(int virsta) {
        this.virsta = virsta;
    }

    public String getAddreess() {
        return addreess;
    }

    public void setAddreess(String addreess) {
        this.addreess = addreess;
    }
}
