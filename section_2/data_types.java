package section_2;

/*
 * The primitive data types are
 * byte (-128 to 127)
 * short (-32,768 to 32,767)
 * int (-2B to 2B)
 * long (-9 quintillion to 9 quintillion) add an l
 * float (precision up to 6 decimals) add an f
 * double (precision up to 15 decimals) add an d
 * boolean (true or false)
 * char (single character)
 */

public class data_types {
  public static void main(String[] args) {
    int result = addTwoNumbers(1, 2);
    System.out.println(result);

    float result2 = addShoeSizes(7.5f, 9.5f);
    System.out.println(result2);

    if(checkLetter('a')) System.out.println("The letter is a!");    
    if(checkLetter('b')) System.out.println("The letter is a!");
  }

  // This method returns an integer, which can be saved into a variable.
  public static int addTwoNumbers(int a, int b) {
    String formatted = String.format("The value of a is %d and the value of b is %d", a, b);
    System.out.println(formatted);

    int sum = a + b;
    return sum;
  }

  // This method returns a float, which can be saved into a variable.
  public static float addShoeSizes(float a, float b) {
    float shoeSizeSum = a + b;
    return shoeSizeSum;
  }

  // This method checks if the letter is equal to 'a'. We use the boolean and char data type.
  public static boolean checkLetter(char letter) {
    boolean isEqual = letter == 'a';
    return isEqual;
  }
}
