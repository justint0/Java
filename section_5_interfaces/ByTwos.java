package section_5_interfaces;

// ByTwos must implement the getNext() and getPrev() methods

public class ByTwos implements SeriesSub {
  int val;

  // ByTwos class constructor
  ByTwos() {
    val = 0;
  }

  public int getNext() {
    if(val >= MAX) {
      System.out.println(ERRORMSG);
    } else {
      val += 2;
    }
    return val;
  }

  public int getPrev() {
    val -= 2;
    return val;
  }

  public void printGreeting() {
    System.out.println("Hello, ByTwos class!");
  }
}
