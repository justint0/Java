package section_5;

public class Main {
  public static void main(String[] args) {
    Vampire vampire = new Vampire();
    Werewolf werewolf = new Werewolf();

    // Polymorphism
    Enemy[] enemies = {vampire, werewolf};
    for(Enemy enemy : enemies) {
      enemy.Talk();
    }

    Vampire vampire2 = new Vampire();
    vampire2.setHealth(25);
    vampire2.getHealth();
  }
}
