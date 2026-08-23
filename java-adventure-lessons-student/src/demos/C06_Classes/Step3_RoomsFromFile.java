package demos.C06_Classes;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * LESSON 5, STEP 3  -  Ch. 6 combined with Ch. 4.10
 *
 * This combines file reading with classes: every three lines becomes one
 * Room object. rooms.txt is already beside this source file; run from this
 * directory so the relative path resolves correctly.
 */
public class Step3_RoomsFromFile
{
   public static void main(String[] args) throws IOException
   {
      Scanner inputFile = new Scanner(new File("rooms.txt"));

      // An array of Room objects -- Gaddis Ch. 7 previewed lightly.
      Room[] rooms = new Room[10];
      int count = 0;

      while (inputFile.hasNextLine() && count < rooms.length)
      {
         String name = inputFile.nextLine();
         if (!inputFile.hasNextLine())
         {
            System.out.println("Skipping incomplete room after: " + name);
            break;
         }
         String description = inputFile.nextLine();
         if (!inputFile.hasNextLine())
         {
            System.out.println("Skipping incomplete room after: " + name);
            break;
         }
         String exits = inputFile.nextLine();

         rooms[count] = new Room(name, description, exits);
         count++;
      }
      inputFile.close();

      System.out.println("Loaded " + count + " rooms.");
      System.out.println();

      for (int i = 0; i < count; i++)
      {
         rooms[i].describe();
         System.out.println();
      }
   }
}
