package InterfaceSegregationPrinciple;

public class Main {
    public static void main(String[] args) {
      WashingMachine washingMachine = new Wash();
      Oven oven = new Cook();
  
      washingMachine.washClothes();
      washingMachine.spin();
  
      oven.cookFood();
      oven.bake();
    }
  }
  
