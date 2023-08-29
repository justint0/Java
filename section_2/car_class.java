// A package in Java is used to group related classes.
package section_2;

// We can create a car class, which is a blueprint for car objects.

// Public means everyone is allowed to access.
// Private means that only members of the same class are allowed to access.
// Protected means that members of subclasses are also allowed.

public class car_class {
  // Declaring class fields
  String make;
  String model;
  int year;
  float price;

  /*
   * The final keyword can be applied to classes, methods, and variables.
   * It stops classes from being extended.
   * It stops methods from being overriden in subclasses.
   * It stops variables from being redeclared.
   */

  public static final String DEALER = "Hartford Auto";

  // Default constructor
  // public car_class {
  // }

  // Car_class constructor
  public car_class(String make, String model, int year, float price) {
    this.make = make;
    this.model = model;
    this.year = year;
    this.price = price;
  }

  // Getters and setters control how important variables are accessed and updated in your code.
  public String getMake() {
    return this.make;
  }

  public String getModel() {
    return this.model;
  }

  public void setMake(String newMake) {
    this.make = newMake;
  }

  public void setModel(String newModel) {
    this.model = newModel;
  } 

  public void makeNoise() {
    System.out.println("VROOOOOOM");
  }

  // Static methods can be called on the Class itself, and not on objects created from the class.
  public static void printClassDescription() {
    System.out.println("This is a class for building Car objects.");
  }
}