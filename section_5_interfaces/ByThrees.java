package section_5_interfaces;

public class ByThrees implements SeriesSub {
  int val;

  ByThrees() {
    val = 0;
  }

  public int getNext() {
    if(val >= MAX) {
      System.out.println(ERRORMSG);
    } else {
      val += 3;
    }
    return val;
  }

  public int getPrev() {
    val -= 3;
    return val;
  }

  public void printGreeting() {
    System.out.println("Hello, ByThrees class!");
  }
}
