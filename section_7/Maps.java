package section_7;

import java.util.HashMap;
// import java.util.TreeMap;

// Maps store key-value pairs. We can get a value from its key.
// TreeMaps and LinkedHashMaps work the same way as TreeSets and LinkedHashSets.

public class Maps {
  public static void main(String[] args) {
    HashMap<String, Float> foodPrices = new HashMap<>();

    foodPrices.put("Bread", 4.25f);
    foodPrices.put("Milk", 2.66f);
    foodPrices.put("Eggs", 2.56f);
    foodPrices.put("Chips", 3.87f);

    // Get a value
    // System.out.println(foodPrices.get("Bread"));

    // Remove a value
    // foodPrices.remove("Bread")
  }  
}
