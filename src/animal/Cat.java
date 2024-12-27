package animal;

public class Cat extends Animal{
    String race;

    public Cat(String name, int age, String race) {
        super(name, age);
        this.race = race;
    }

    //@Override
    public void make() {
        super.showDetails();
        System.out.println( ", de tip:: " + race +" -- face miau miau");
    }
}
