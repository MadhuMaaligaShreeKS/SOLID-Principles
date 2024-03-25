package InterfaceSegregationPrinciple;

class Wash implements WashingMachine {
    @Override
    public void washClothes() {
      System.out.println("Washing clothes...");
      // Implement washing logic
    }
  
    @Override
    public void spin() {
      System.out.println("Spinning clothes...");
      // Implement spinning logic
    }
  }