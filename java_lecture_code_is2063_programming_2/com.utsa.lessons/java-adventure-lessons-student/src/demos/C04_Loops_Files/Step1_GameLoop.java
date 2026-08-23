package demos.C04_Loops_Files;

import java.util.Scanner;

/**
 * LESSON 3, STEP 1  -  Gaddis Ch. 4.2 (the while loop),
 *                      Ch. 4.6 (sentinel values)
 *
 * "quit" is the sentinel value that ends the repeated command loop.
 */
public class Step1_GameLoop
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      String command = "";

      System.out.println("THE OLD LIBRARY");
      System.out.println("Type 'quit' to leave.");

      while (!command.equals("quit"))
      {
         System.out.print("> ");
         command = keyboard.nextLine().trim().toLowerCase();

         if (command.equals("look"))
         {
            System.out.println("Dust hangs in the light from a high window.");
         }
         else if (command.equals("north"))
         {
            System.out.println("You climb the stair to the gallery.");
         }
         else if (command.equals("quit"))
         {
            System.out.println("You step out into the rain.");
         }
         else
         {
            System.out.println("You cannot do that here.");
         }
      }
   }
}
