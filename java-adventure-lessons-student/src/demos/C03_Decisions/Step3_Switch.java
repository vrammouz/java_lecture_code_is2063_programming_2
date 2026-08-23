package demos.C03_Decisions;

import java.util.Scanner;

/**
 * LESSON 2, STEP 3  -  Gaddis Ch. 3.9 (the switch statement),
 *                      plus equalsIgnoreCase and trim
 *
 * Same behaviour as Step 1, written as a switch.
 *
 * Save this design for comparison with the polymorphism examples in Chapter 10.
 * Later, consider which files must change when a new command is added.
 */
public class Step3_Switch
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);

      System.out.println("THE OLD LIBRARY");
      System.out.print("> ");

      // trim() removes stray spaces; toLowerCase() makes "NORTH" work too.
      String command = keyboard.nextLine().trim().toLowerCase();

      switch (command)
      {
         case "look":
            System.out.println("Dust hangs in the light from a high window.");
            break;
         case "north":
            System.out.println("You climb the stair to the gallery.");
            break;
         case "east":
            System.out.println("The door is locked.");
            break;
         case "quit":
            System.out.println("Goodbye.");
            break;
         default:
            System.out.println("You cannot do that here.");
      }
   }
}
