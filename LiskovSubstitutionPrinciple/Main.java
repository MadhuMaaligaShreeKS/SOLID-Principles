package LiskovSubstitutionPrinciple;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car(50);
        Vehicle bicycle = new Bicycle(true);

        // Start vehicles
        car.start();
        bicycle.start();
    }
}
