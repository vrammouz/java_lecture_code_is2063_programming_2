package chapter04.demo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * LESSON 3, STEP 2  -  Gaddis Ch. 4.10 (introduction to file input and output)
 *
 * The room text now lives OUTSIDE the program. Change rooms.txt, run again,
 * and explain why the output changes without recompiling the Java source.
 *
 * "throws IOException" acknowledges that file access can fail. Chapter 11
 * examines how a program can respond instead of ending.
 *
 * FILE FORMAT: three lines per room -- name, description, comma-separated exits.
 */
public class Step2_ReadRooms
{
   public static void main(String[] args) throws IOException
   {
      InputStream resource = Step2_ReadRooms.class.getResourceAsStream("rooms.txt");
      if (resource == null)
         throw new FileNotFoundException("rooms.txt resource not found");

      Scanner inputFile = new Scanner(resource);

      int roomCount = 0;

      while (inputFile.hasNext())
      {
         String name = inputFile.nextLine();
         String description = inputFile.nextLine();
         String exits = inputFile.nextLine();

         roomCount++;

         System.out.println("Room " + roomCount + ": " + name);
         System.out.println("   " + description);
         System.out.println("   Exits: " + exits);
         System.out.println();
      }

      inputFile.close();
      System.out.println("Loaded " + roomCount + " rooms.");
   }
}
