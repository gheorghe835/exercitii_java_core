package animal;

public class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }





    public void showDetails(){
        System.out.print("  Animalul:: " + name + ", in virsta de:: " + age + " ani ");
    }
}
