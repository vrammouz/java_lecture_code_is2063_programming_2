package chapter03.demo;

import java.util.Scanner;

/**
 * LESSON 2, STEP 1  -  Gaddis Ch. 3.1-3.4 (if, if-else, if-else-if)
 *
 * One command, one response. There is no loop yet, so the program handles
 * exactly one command and stops. What structure would repeated commands need?
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
