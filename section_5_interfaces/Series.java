package section_5_interfaces;

// An interface is a completely "abstract class" that is used to group related methods with empty bodies.

public interface Series {
  int MAX = 10;
  String ERRORMSG = String.format("Cannot go above value: %d", MAX);

  int getNext();

  default void printGreeting() {
    System.out.println("Hello, World!");
  };
}
