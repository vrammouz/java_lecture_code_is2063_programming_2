package demos.C04_Loops_Files;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * LESSON 3, STEP 2  -  Gaddis Ch. 4.10 (introduction to file input and output)
 *
 * The room text now lives outside the program. Edit rooms.txt, run again
 * without recompiling, and observe how data can change program behavior.
 * "throws IOException" indicates that opening or reading the file can fail.
 * Chapter 11 develops explicit recovery from that failure.
 *
 * FILE FORMAT: three lines per room -- name, description, comma-separated exits.
 */
public class Step2_ReadRooms
{
   public static void main(String[] args) throws IOException
   {
      File file = new File("rooms.txt");
      Scanner inputFile = new Scanner(file);

      int roomCount = 0;

      while (inputFile.hasNextLine())
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
