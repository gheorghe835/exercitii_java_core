package car;

public class Printer {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(" Opel", 250,5);
        vehicle.showDetails();
        Motorcycle motorcycle = new Motorcycle("Yamaha",340,"Sport");
        motorcycle.showDetails();
        TypeCar typeCar = new TypeCar("BMV",310,2,"sportcar","i8");
        typeCar.showDetails();
    }
}
