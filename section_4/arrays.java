package section_4;

import java.util.ArrayList;
import java.util.Arrays;

public class arrays {
  public static void main(String[] args) {

    // Arrays have a fixed size and can hold primitives or objects.
    String[] friendsArray = {"John", "Chris", "Eric", "Luke"};

    // ArrayList grows and shrinks automatically, but can only hold objects  (they do support wrapper types for primitives)
    ArrayList<String> friendsArrayList =
      new ArrayList<>(Arrays.asList("John", "Chris", "Eric", "Luke"));
    
    // Getting an element
    System.out.println(friendsArray[1]);
    System.out.println(friendsArrayList.get(1));

    // Getting size
    System.out.println(friendsArray.length);
    System.out.println(friendsArrayList.size());

    // Add an element
    friendsArrayList.add("Mitch");
    System.out.println(friendsArrayList.get(4));

    // Set an element
    friendsArray[0] = "Carl";
    System.out.println(friendsArray[0]);
    friendsArrayList.set(0, "Carl");
    System.out.println(friendsArrayList.get(0));

    // Remove elements
    friendsArrayList.remove("Chris");
    System.out.println(friendsArrayList.get(1));

    // Print
    System.out.println(friendsArray);
    System.out.println(friendsArrayList);
  }
}
