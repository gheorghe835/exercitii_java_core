package car;

public class Car {
    String brand;
    int maxSpeed;

    public Car(String brand, int maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    public void showDetails(){
        System.out.println("  Autovehiculul:: " + brand + ", cu viteza maxima:: " + maxSpeed);
    }
}
