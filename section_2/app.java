package section_2;

public class app {
  public static void main(String[] args) {
    // Didn't have to create an object to use the static methods
    car_class.printClassDescription();

    // Print final variable
    System.out.println(car_class.DEALER);

    car_class myCar = new car_class("Toyota", "Camry", 2022, 25135.23f);
    myCar.makeNoise();

    System.out.println(myCar.getMake());
    System.out.println(myCar.getModel());

    myCar.setMake("Honda");
    myCar.setModel("Civic");
    System.out.println(myCar.getMake());
    System.out.println(myCar.getModel());  
  }
}
