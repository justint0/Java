package section_3;

import java.util.Scanner;
import java.util.Random;

public class rockpaperscissors {
  
  public static void main(String[] args) {
    // Main function
    play();
    System.out.println("Game has ended!");
  }

  private static void play() {
    // Rock paper scissors logic
    String[] options = {"ROCK", "PAPER", "SCISSORS"};

    // Generate machine choice
    Random rand = new Random();
    int upperbound = 2;
    int int_random = rand.nextInt(upperbound);
    String cpu = options[int_random];

    // Get user input
    String user;
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter 'rock', 'paper', or 'scissors' into the terminal.");
    user = reader.nextLine().toUpperCase().trim();
    reader.close();

    // Comparisons
    // Use == to compare primitives and .equals() to compare non-primitives
    if (cpu.equals(user)) System.out.println("It's a tie!");
    if (cpu.equals("ROCK") && user.equals("PAPER")) System.out.println("User wins!");    
    if (cpu.equals("PAPER") && user.equals("ROCK")) System.out.println("CPU wins!");
    if (cpu.equals("SCISSORS") && user.equals("ROCK")) System.out.println("User wins!");
    if (cpu.equals("ROCK") && user.equals("SCISSORS")) System.out.println("CPU wins!");
    if (cpu.equals("PAPER") && user.equals("SCISSORS")) System.out.println("User wins!");
    if (cpu.equals("SCISSORS") && user.equals("PAPER")) System.out.println("CPU wins!");

    System.out.println("CPU chose " + cpu);
    System.out.println("User chose " + user);
  }
}
