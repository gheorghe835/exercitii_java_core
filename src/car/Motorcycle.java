package car;

public class Motorcycle extends Car{
    String typeSeat;

    public Motorcycle(String brand, int maxSpeed, String typeSeat) {
        super(brand, maxSpeed);
        this.typeSeat = typeSeat;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println(" Tipul de scaun:: " + typeSeat);
    }
}
