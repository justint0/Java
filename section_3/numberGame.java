package section_3;

// Import Scanner and Random class
import java.util.Scanner;
import java.util.Random;

public class numberGame {
  public static void main(String[] args) {
    play();
    System.out.println("End of game!");
  }

  private static void play() {
    Random rand = new Random();
    int upperbound = 100;
    int int_random = rand.nextInt(upperbound);
    int userGuess = -1;
    int tries = 0;

    while(int_random != userGuess) {
      Scanner reader = new Scanner(System.in);
      System.out.println("Enter your guess between 0 and 100, inclusive ");
      userGuess = reader.nextInt();

      if(int_random == userGuess) {
        tries += 1;
        System.out.println("You have correctly guessed the number: " + userGuess);
        System.out.println("It took " + tries + " tries.");
        reader.close();
      } else if (int_random != userGuess) {
        tries += 1;
        System.out.println("Your guess of " + userGuess + " was wrong. Please guess again.");
        // Ternary operator
        String clue = int_random > userGuess ? "Higher" : "Lower";
        System.out.println(String.format("Clue: %s", clue));
      }
    }
  }
}
