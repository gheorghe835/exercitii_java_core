package animal;

public class Dog extends Animal{
    String race;

    public Dog(String name, int age, String race) {
        super(name, age);
        this.race = race;
    }

    //@Override
    public void make() {
        super.showDetails();
        System.out.print(", de tip:: " + race + " -- face ham ham\n");

    }
}
