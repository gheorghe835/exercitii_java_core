package animal;

import car.Car;

public class Printer {
    public static void main(String[] args) {
        Dog dog = new Dog("  Sharic",2,"ciine");
        //dog.showDetails();
        dog.make();
        Cat cat = new Cat("  Thomas",3,"pisica");
        cat.make();
    }
}
