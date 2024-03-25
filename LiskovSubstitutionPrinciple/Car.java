package LiskovSubstitutionPrinciple;

class Car extends Vehicle {
    private int fuelLevel;

    public Car(int fuelLevel) {
        super("Car");
        this.fuelLevel = fuelLevel;
    }

    @Override
    public void start() {
        if (fuelLevel > 0) {
            System.out.println("Car started");
        } else {
            System.out.println("No fuel, cannot start the car");
        }
    }
}
