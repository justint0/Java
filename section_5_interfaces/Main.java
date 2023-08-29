package section_5_interfaces;

public class Main {
  public static void main(String[] args) {
    ByTwos byTwos = new ByTwos();
    ByThrees byThrees = new ByThrees();
    SeriesSub ob;

    for(int i = 0; i < 5; i++) {
      ob = byTwos;
      System.out.println("ByTwos: " + ob.getNext());

      ob = byThrees;
      System.out.println("ByThrees: " + ob.getNext());
    }

    byTwos.printGreeting();
    byThrees.printGreeting();
  }
}
