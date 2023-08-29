package section_3;

public class logic {
  public static void main(String[] args) {
    programming_logic();
  }

  public static void programming_logic() {

    // If/else if/else logic
    int magicNumber = 42;
    if (magicNumber < 30) {
      System.out.println("The magic number is below 30!");
    } else if (magicNumber >= 30 && magicNumber <= 42) {
      System.out.println("The magic number is between 30 and 42, inclusive");
    } else {
      System.out.println("The magic number is greater than 42");
    }

    // While loops
    int counter = 0;
    while (counter < 5) {
      System.out.println(String.format("Counter ticks up ... %d", counter));
      counter += 1;
    }

    // Do-while loops run at least once
    int counter2 = 0;
    do {
      counter2 += 1;
      System.out.println(String.format("Counter2 is now %d", counter2));
    } while (counter2 < 0);

    // For loops
    for(int i = 0; i < 5; i++) {
      System.out.println(String.format("The current value of i is %d", i));
    }

    // Nested for loops
    for (int i = 1; i < 3; i++) {
      for (int j = 1; j < 6; j++) {
        System.out.println("Set: " + i + ", Rep: " + j);
      }
    } 

    // Logical operators
    int x = 10;
    int y = 20;

    // && returns true if both statements are true.
    if(x > 5 && y < 25) {
      System.out.println("X is greater than 5 and Y is less than 25");
    }

    if(x > 5 || y < 15) {
      System.out.println("X is greater than 5 or Y is less than 15");
    }

    if(!(x > 100)) {
      System.out.println("X is not greater than 100!");
    }

    // Ternary operators 
    int age = 21;
    boolean drinkingAge = age >= 21 ? true : false;
    System.out.println(drinkingAge);
  }
}
