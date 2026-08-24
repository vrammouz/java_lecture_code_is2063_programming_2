package chapter05.demo;

import java.util.Scanner;

/**
 * LESSON 4, STEP 1  -  Gaddis Ch. 5.1 (introduction to methods),
 *                      Ch. 5.4 (returning a value)
 *
 * Identical behaviour to Lesson 3 Step 1. The ONLY change is that main is
 * now short enough to read in one glance.
 *
 * Compare this with Chapter 4 Step 1. Which version would be safer to change
 * six weeks from now? Support your answer with two specific code features.
 */
public class Step1_ExtractMethods
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      String command = "";

      printBanner();

      while (!command.equals("quit"))
      {
         command = readCommand(keyboard);
         respondTo(command);
      }
   }

   /** Prints the opening text. Takes nothing, returns nothing. */
   public static void printBanner()
   {
      System.out.println("THE OLD LIBRARY");
      System.out.println("Type 'quit' to leave.");
   }

   /** Prompts for and returns one cleaned-up command. */
   public static String readCommand(Scanner keyboard)
   {
      System.out.print("> ");
      return keyboard.nextLine().trim().toLowerCase();
   }

   /** Prints the response to a single command. */
   public static void respondTo(String command)
   {
      if (command.equals("look"))
         System.out.println("Dust hangs in the light from a high window.");
      else if (command.equals("north"))
         System.out.println("You climb the stair to the gallery.");
      else if (command.equals("quit"))
         System.out.println("You step out into the rain.");
      else
         System.out.println("You cannot do that here.");
   }
}
