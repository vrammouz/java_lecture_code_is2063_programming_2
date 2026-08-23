package demos.C04_Loops_Files;

import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * LESSON 3, STEP 3  -  Gaddis Ch. 4.10 (writing to a file with PrintWriter)
 *
 * Every command the player types gets written to transcript.txt.
 *
 * After running, inspect transcript.txt. The close() call flushes buffered
 * output and releases the file resource. Chapter 11 introduces a safer way
 * to guarantee cleanup when an error occurs.
 */
public class Step3_SaveTranscript
{
   public static void main(String[] args) throws IOException
   {
      Scanner keyboard = new Scanner(System.in);
      PrintWriter outputFile = new PrintWriter("transcript.txt");

      String command = "";
      int turnNumber = 0;

      System.out.println("THE OLD LIBRARY  (type 'quit' to leave)");

      while (!command.equals("quit"))
      {
         System.out.print("> ");
         command = keyboard.nextLine().trim().toLowerCase();
         turnNumber++;

         outputFile.println(turnNumber + ": " + command);

         if (command.equals("look"))
         {
            System.out.println("Dust hangs in the light from a high window.");
         }
         else if (command.equals("quit"))
         {
            System.out.println("You step out into the rain.");
         }
         else
         {
            System.out.println("You cannot do that here.");
         }
      }

      outputFile.close();
      System.out.println("Transcript saved: " + turnNumber + " turns.");
   }
}
