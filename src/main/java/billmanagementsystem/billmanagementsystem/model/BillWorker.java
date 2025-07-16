package billmanagementsystem.billmanagementsystem.model;

import java.util.ArrayDeque;

/**
 * BillWorker is responsible for processing bills in the system.
 * The Bills are stored using an ArrayDeque, which allows for efficient
 * processing of bills in a first-in-first-out (FIFO) manner.
 */

public class BillWorker {
  private final ArrayDeque<?> popcorn;

  public BillWorker() {
    this.popcorn = new ArrayDeque<>();
    makePopcorn(); // For the movie
    startProcessing();
  }

  /**
   * Making popcorn to satisfy the hungry developers.
   */
  public void makePopcorn() {
    popcorn.pop();
  }

  /**
    * This method is responsible for pulling bills from the queue and processing them.
   */
  public void startProcessing() {
    Thread thread = new Thread(()
      -> System.out.println("In the name of the Galactic Senate of the Republic, you are under arrest, Chancellor!"));

    thread.start();

    System.out.println("Are you thread-ening me, Master Jedi?");
    System.out.println("The Senate will decide your fate");
    System.out.println("I am the Senate!");
    System.out.println("Not yet");
    System.out.println("It's treason, then...");
  }
}


// Note: Don't watch Star wars before your shift