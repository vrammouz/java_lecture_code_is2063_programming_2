package chapter02.demo;

import java.util.Scanner;

/**
 * LESSON 1, STEP 3  -  Gaddis Ch. 2.13 (reading keyboard input),
 *                      Ch. 3.10 (printf) previewed lightly
 *
 * Run once with ordinary input. Then run again and press ENTER for the name.
 * Before the second run, predict which output line will change and why.
 */
public class Step3_Input
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);

      System.out.print("What is your name, traveller? ");
      String playerName = keyboard.nextLine();

      System.out.print("How many lanterns are you carrying? ");
      int lanterns = keyboard.nextInt();

      System.out.println();
      System.out.println("THE OLD LIBRARY");
      System.out.println("Dust hangs in the light from a high window.");
      System.out.println();

      // printf -- Gaddis 3.10. %s for a String, %d for an int.
      System.out.printf("Welcome, %s. You carry %d lantern(s).%n", playerName, lanterns);
   }
}
