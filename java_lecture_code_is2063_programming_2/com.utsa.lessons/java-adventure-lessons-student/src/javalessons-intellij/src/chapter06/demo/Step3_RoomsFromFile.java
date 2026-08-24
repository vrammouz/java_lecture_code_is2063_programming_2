package chapter06.demo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * LESSON 5, STEP 3  -  Ch. 6 combined with Ch. 4.10
 *
 * This combines earlier file reading with classes:
 * every three lines of the file becomes one Room object.
 *
 * Trace one group of three input lines into one Room object before running.
 * The required rooms.txt file is already beside this source file.
 */
public class Step3_RoomsFromFile
{
   public static void main(String[] args) throws IOException
   {
      InputStream resource = Step3_RoomsFromFile.class.getResourceAsStream("rooms.txt");
      if (resource == null)
         throw new FileNotFoundException("rooms.txt resource not found");

      Scanner inputFile = new Scanner(resource);

      // An array of Room objects -- Gaddis Ch. 7 previewed lightly.
      Room[] rooms = new Room[10];
      int count = 0;

      while (inputFile.hasNextLine() && count < rooms.length)
      {
         String name = inputFile.nextLine();
         String description = inputFile.nextLine();
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
