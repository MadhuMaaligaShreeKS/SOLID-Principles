package InterfaceSegregationPrinciple;

class Cook implements Oven {
    @Override
    public void cookFood() {
      System.out.println("Cooking food...");
      // Implement cooking logic
    }
  
    @Override
    public void bake() {
      System.out.println("Baking...");
      // Implement baking logic
    }
  }
  