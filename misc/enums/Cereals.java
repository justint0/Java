package misc.enums;

// An enum is a special "class" that represents a group of constants.

public enum Cereals {

  CAPTAIN_CRUNCH(50, 3.50f),
  FROOT_LOOPS(60, 4.56f),
  REESES_PUFFS(100, 5.14f),
  COCOA_PUFFS(75, 3.98f);

  final int levelOfDeliciousness;
  final float price;

  Cereals(int levelOfDeliciousness, float price) {
    this.levelOfDeliciousness = levelOfDeliciousness;
    this.price = price;
  }
}
