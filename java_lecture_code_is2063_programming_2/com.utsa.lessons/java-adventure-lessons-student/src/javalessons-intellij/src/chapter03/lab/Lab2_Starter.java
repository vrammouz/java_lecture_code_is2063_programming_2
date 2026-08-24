package chapter03.lab;

import java.util.Scanner;

/**
 * LAB 2 STARTER  -  Gaddis Ch. 3
 *
 * THIS PROGRAM HAS A BUG. It compiles and runs, but one branch never
 * executes no matter what the player types.
 *
 * YOUR TASK
 * ---------
 * 1. Run it. Type "open" and then type "OPEN". Note what happens.
 * 2. Find the bug. Write ONE SENTENCE at the top of the file saying what
 *    was wrong -- in words, before you change any code.
 * 3. Fix it.
 * 4. Add a fourth command of your own using else-if.
 * 5. Add a check that uses a logical operator (&& or ||) -- for example,
 *    "you may only open the chest if you have the key AND the lantern".
 *
 * DONE WHEN: every command works, including in capital letters, and your
 * one-sentence diagnosis is at the top of the file.
 */
public class Lab2_Starter
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);

      boolean hasKey = true;
      boolean hasLantern = false;

      System.out.println("THE STOREROOM");
      System.out.println("A heavy chest sits in the corner.");
      System.out.print("> ");
      String command = keyboard.nextLine();

      if (command == "open")                       // <-- look here
      {
         System.out.println("The chest creaks open.");
      }
      else if (command.equals("look"))
      {
         System.out.println("Shelves of dusty jars line the walls.");
      }
      else
      {
         System.out.println("Nothing happens.");
      }
   }
}
