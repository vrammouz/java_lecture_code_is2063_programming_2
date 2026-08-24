package chapter07.demo;

import java.util.ArrayList;

/**
 * CHAPTER 7, STEP 1  -  Gaddis 7.10-7.11 (the ArrayList class)
 *
 * An ArrayList is similar to a Python list: it can grow and shrink.
 * Record which operations below have direct Python-list equivalents.
 */
public class Step1_ArrayListFirst
{
   public static void main(String[] args)
   {
      ArrayList<String> inventory = new ArrayList<String>();

      inventory.add("lantern");
      inventory.add("brass key");
      inventory.add("folded map");

      System.out.println("Carrying " + inventory.size() + " items:");
      for (int i = 0; i < inventory.size(); i++)
      {
         System.out.println("  " + i + ": " + inventory.get(i));
      }

      inventory.remove("brass key");
      System.out.println();
      System.out.println("Dropped the key. Now carrying " + inventory.size() + ":");

      // The enhanced for loop -- Gaddis 7.4
      for (String item : inventory)
      {
         System.out.println("  " + item);
      }

      System.out.println();
      System.out.println("Have a lantern? " + inventory.contains("lantern"));
   }
}
