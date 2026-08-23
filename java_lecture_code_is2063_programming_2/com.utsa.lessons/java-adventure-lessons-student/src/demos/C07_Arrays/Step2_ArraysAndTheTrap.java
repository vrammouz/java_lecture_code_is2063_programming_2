package demos.C07_Arrays;

/**
 * CHAPTER 7, STEP 2  -  Gaddis 7.1-7.3 (arrays, bounds, length)
 *
 * NOW arrays -- as the fixed-size thing that explains why ArrayList exists.
 *
 * *** PREDICT BEFORE RUNNING: how many lines print before the crash? ***
 *
 * Two traps in one file:
 *   1. array.length is a FIELD (no parentheses). list.size() is a METHOD.
 *   2. valid indexes are 0 .. length-1, so <= length is off by one.
 */
public class Step2_ArraysAndTheTrap
{
   public static void main(String[] args)
   {
      String[] inventory = new String[3];      // fixed. forever. three slots.

      inventory[0] = "lantern";
      inventory[1] = "brass key";
      inventory[2] = "folded map";

      System.out.println("Slots: " + inventory.length + "   (a field, no parentheses)");

      // Correct loop
      for (int i = 0; i < inventory.length; i++)
      {
         System.out.println("  " + i + ": " + inventory[i]);
      }

      System.out.println();
      System.out.println("Now the off-by-one. Watch:");

      try
      {
         for (int i = 0; i <= inventory.length; i++)     // <-- <= is the bug
         {
            System.out.println("  " + i + ": " + inventory[i]);
         }
      }
      catch (ArrayIndexOutOfBoundsException e)
      {
         System.out.println();
         System.out.println("CRASH: " + e);
         System.out.println("Index 3 does not exist. Valid indexes are 0, 1, 2.");
         System.out.println("An ArrayList would have grown. An array cannot.");
      }
   }
}
