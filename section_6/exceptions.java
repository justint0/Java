package section_6;

public class exceptions {
  public static void main(String[] args) {
    divide(14, 0);
  }

  public static void divide(int dividend, int divisor) {
    try {
      int quotient = dividend / divisor;
      System.out.println(String.format("The quotient is %d", quotient)); 
    } catch (ArithmeticException e) {
      System.out.println(String.format("Can't be divided by zero (%s)", e));
    } finally {
      System.out.println("Mathematics is the language of the universe.");
    }
  }
}
