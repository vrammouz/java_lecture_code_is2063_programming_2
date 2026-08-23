package demos.C02_Fundamentals;

import java.util.Scanner;

/**
 * LESSON 1, STEP 3  -  Gaddis Ch. 2.13 (reading keyboard input),
 *                      Ch. 3.10 (printf) previewed lightly
 *
 * This example names the Scanner "keyboard" to describe its input source.
 * Run it once with a name, then again with an empty name. Compare the output.
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
