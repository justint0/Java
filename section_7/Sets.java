package section_7;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

// Sets have no order and cannot contain duplicates

public class Sets {
  public static void main(String[] args) {
    Set<String> names = new HashSet<>();
    names.add("Justin");
    names.add("John");
    names.add("Jordan");
    names.add("James");

    // Remove element
    // names.remove("James");

    // Clear the set
    // names.clear();

    // Iterate over set
    // for (String name : names) {
    //   System.out.println(name);
    // }

    // forEach and :: operator
    // names.forEach(System.out::println);

    // Iterator<String> namesIterator = names.iterator();
    // while (namesIterator.hasNext()) {
    //   System.out.println(namesIterator.next());
    // }

    // TreeSets maintains natural order.
    Set<String> teams = new TreeSet<>();
    teams.add("Pelicans");
    teams.add("Knicks");
    teams.add("Wizards");
    teams.add("Bucks");
    teams.add("Lakers");
    teams.add("Celtics");

    Iterator<String> teamsIterator = teams.iterator();
    while (teamsIterator.hasNext()) {
      System.out.println(teamsIterator.next());
    }

    // LinkedHashSets
    Set<String> states = new LinkedHashSet<>();
    states.add("California");
    states.add("Missouri");
    states.add("Vermont");
    states.add("Utah");
    states.add("Florida");

    Iterator<String> statesIterator = states.iterator();
    while (statesIterator.hasNext()) {
      System.out.println(statesIterator.next());
    }
  }
}
