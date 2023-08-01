package com.linkedin.javacodechallenges;

import java.util.Random;
import java.util.Scanner;

public class DoubleOrNothing {
  private static int startPoints = 10;
  private Scanner scanner = new Scanner(System.in);
  private Random random = new Random();
  private int current = startPoints;
  private boolean isStillPlaying = true;

  public void playGame() {
    // Core implementation, we use a bunch of helper methods
    // to prevent bloating by abstracting them this way for the playGame
    // implementation.
    printWelcome();
    askUserToContinue();
    while (this.isStillPlaying) {
      if (shouldDouble()) {
        doubleCurrent();
        printCongrats();
        askUserToContinue();
      } else {
        printLost();
        return;
      }
    }
  }

  private void printWelcome() {
    System.out.println("Let's play double or nothing.");
  }

  private void printTryToDouble() {
    System.out.println("Let's try to double it!");
  }

  private void printCongrats() {
    System.out.println("Congrats, you now have " + this.current + " points");
  }

  private void printLost() {
    System.out.println("Uh oh, you've lost. No points for you");
  }

  private void printWalkawayMessage() {
    System.out.println("Congrats, you finished with " + this.current + " points");
  }

  private boolean shouldDouble() {
    return this.random.nextInt(2) == 0;
  }

  private void doubleCurrent() {
    this.current = this.current * 2;
  }

  protected void askUserToContinue() {
    System.out.println("Would you like to continue and try to double your points? Enter yes");
    this.isStillPlaying = this.scanner.nextLine().toUpperCase().equals("YES");
  }

  public boolean getIsStillPlaying() {
    return this.isStillPlaying;
  }
}
