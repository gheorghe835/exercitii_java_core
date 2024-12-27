package car;

public class Vehicle extends Car{
    int numberPlaces;

    public Vehicle(String brand, int maxSpeed, int numberPlaces) {
        super(brand, maxSpeed);
        this.numberPlaces = numberPlaces;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("  Numar de locuri:: " + numberPlaces);
    }
}
