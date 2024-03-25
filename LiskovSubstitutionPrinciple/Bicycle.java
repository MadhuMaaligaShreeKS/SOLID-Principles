package LiskovSubstitutionPrinciple;

class Bicycle extends Vehicle {
    private boolean hasPedals;

    public Bicycle(boolean hasPedals) {
        super("Bicycle");
        this.hasPedals = hasPedals;
    }

    @Override
    public void start() {
        if (hasPedals) {
            System.out.println("Bicycle started");
        } else {
            System.out.println("Cannot start the bicycle without pedals");
        }
    }
}
