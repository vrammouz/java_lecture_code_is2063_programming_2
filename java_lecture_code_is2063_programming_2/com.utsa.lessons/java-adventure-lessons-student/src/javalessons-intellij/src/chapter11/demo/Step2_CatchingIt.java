package chapter11.demo;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * CHAPTER 11, STEP 2  -  Gaddis 11.1-11.2 (try/catch, multiple catches, finally)
 *
 * Same situation. The program survives it and says something useful.
 *
 * Run twice: once with rooms.txt present and once after temporarily renaming
 * it. Compare the two paths. The code cannot prevent the problem, but it can
 * decide what happens next.
 */
public class Step2_CatchingIt
{
   public static void main(String[] args)
   {
      String filename = "rooms.txt";
      Scanner inputFile = null;

      try
      {
         InputStream resource = Step2_CatchingIt.class.getResourceAsStream(filename);
         if (resource == null)
            throw new FileNotFoundException(filename + " resource not found");
         inputFile = new Scanner(resource);
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
      finally
      {
         // finally runs whether or not there was a problem.
         if (inputFile != null)
         {
            inputFile.close();
         }
         System.out.println("(cleanup done)");
      }

      System.out.println("The program is still alive.");
   }
}
