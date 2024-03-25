package DependencyInversionPrinciple;

public class Main {
    public static void main(String[] args) {
        Car toyota = new Toyota();
        Driver driver = new Driver(toyota);
        driver.driveCar();
    }
}
