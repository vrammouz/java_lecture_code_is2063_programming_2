package demos.C03_Decisions;

import java.util.Scanner;

/**
 * LESSON 2, STEP 1  -  Gaddis Ch. 3.1-3.4 (if, if-else, if-else-if)
 *
 * One command, one response. Note there is no loop yet -- the program
 * handles exactly one command and then stops. Students will notice and
 * complain. That complaint IS Lesson 3.
 */
public class Step1_FirstCommand
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);

      System.out.println("THE OLD LIBRARY");
      System.out.print("> ");
      String command = keyboard.nextLine();

      if (command.equals("look"))
      {
         System.out.println("Dust hangs in the light from a high window.");
      }
      else if (command.equals("north"))
      {
         System.out.println("You climb the stair to the gallery.");
      }
      else if (command.equals("east"))
      {
         System.out.println("The door is locked.");
      }
      else
      {
         System.out.println("You cannot do that here.");
      }
   }
}
