package labs.C05_Methods;

import java.util.Scanner;

/**
 * LAB 4 STARTER  -  Gaddis Ch. 5
 *
 * Below is a working program written as one long main method.
 * It is 40 lines and it is horrible.
 *
 * YOUR TASK
 * ---------
 * Do not change what the program DOES. Change only how it is organised.
 *
 * 1. Extract at least FOUR methods from main.
 * 2. At least one must return a value.
 * 3. At least one must take a parameter.
 * 4. main must end up under 15 lines.
 * 5. Write a one-line comment above each method saying what it does.
 *
 * DONE WHEN: the output is byte-for-byte identical to the original, and
 * main is under 15 lines. Run the original first and save its output so
 * you can compare.
 */
public class Lab4_Starter
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      int health = 100;
      int coins = 0;
      String command = "";

      System.out.println("=================================");
      System.out.println("      THE FLOODED CELLAR");
      System.out.println("=================================");
      System.out.println("Cold water laps at your ankles.");

      while (!command.equals("quit"))
      {
         System.out.print("> ");
         command = keyboard.nextLine().trim().toLowerCase();

         if (command.equals("look"))
         {
            System.out.println("Something metal glints beneath the surface.");
         }
         else if (command.equals("take"))
         {
            coins = coins + 5;
            System.out.println("You pocket five coins.");
         }
         else if (command.equals("wade"))
         {
            health = health - 10;
            System.out.println("The cold bites. You feel weaker.");
         }
         else if (command.equals("status"))
         {
            System.out.println("Health: " + health + "   Coins: " + coins);
         }
         else if (command.equals("quit"))
         {
            System.out.println("You climb the stair, dripping.");
         }
         else
         {
            System.out.println("You cannot do that here.");
         }
      }
   }
}
