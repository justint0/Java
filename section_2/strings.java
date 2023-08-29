package section_2;

// String is a non-primitive data type but it is predefined in Java.
// Strings also have a lot of methods: programiz.com/java-programming/library/string

public class strings {
  public static void main(String[] args) {
    int length = returnLength("Justin");
    System.out.println(length);

    checkEquality("USA", "USA");
  }

  // length() method
  public static int returnLength(String name) {
    return name.length();
  }

  // equals() method
  public static void checkEquality(String string1, String string2) {
    boolean isEqual = string1.equals(string2);
    System.out.println(isEqual);
  }

  public static void convertToString() {
    Integer number = 1;
    String numberToString = number.toString();
    System.out.println(numberToString + " is of type " + numberToString.getClass());
  }
}
