package car;

public class TypeCar extends Vehicle{
    String type;
    String model;

    public TypeCar(String brand, int maxSpeed, int numberPlaces, String type, String model) {
        super(brand, maxSpeed, numberPlaces);
        this.type = type;
        this.model = model;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("  Tipul vehicului:: " + type + ", de model:: " + model);
    }
}
