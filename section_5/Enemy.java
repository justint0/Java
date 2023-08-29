package section_5;

// If we wrote public final class, Enemy would not be able to be extended.
public class Enemy {
  // If we wrote private final int health, we would not be able to reassign this variable.
  // This is also encapsulation.
  private int health;

  // If we wrote public final void Talk(), we would not be able to override this method.
  public void Talk() {
    System.out.println("I am an enemy. You better run!");
  }

  public void getHealth() {
    System.out.println(health);
  }

  public void setHealth(int x) {
    health = x;
  }
}
