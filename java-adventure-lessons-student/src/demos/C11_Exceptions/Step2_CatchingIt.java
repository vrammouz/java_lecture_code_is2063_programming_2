package demos.C11_Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * CHAPTER 11, STEP 2  -  try/catch and try-with-resources
 *
 * Same situation. The program survives it and says something useful.
 *
 * Run it once with rooms.txt present and once after temporarily renaming the
 * file. Compare the successful and recovery paths.
 * try-with-resources closes the Scanner on both success and failure.
 */
public class Step2_CatchingIt
{
   public static void main(String[] args)
   {
      String filename = "rooms.txt";
      try (Scanner inputFile = new Scanner(new File(filename)))
      {
         int lines = 0;
         while (inputFile.hasNextLine())
         {
            inputFile.nextLine();
            lines++;
         }
         System.out.println("Read " + lines + " lines from " + filename);
      }
      catch (FileNotFoundException e)
      {
         System.out.println("Could not find " + filename + ".");
         System.out.println("Starting with an empty world instead.");
      }
      System.out.println("(resource cleanup is automatic)");
      System.out.println("The program is still alive.");
   }
}
