package chapter04.demo;

import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * LESSON 3, STEP 3  -  Gaddis Ch. 4.10 (writing to a file with PrintWriter)
 *
 * Every command the player types gets written to transcript.txt.
 *
 * After a normal run, inspect transcript.txt. Then predict the risk of
 * removing outputFile.close(): buffered data may not reach the file.
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

      outputFile.close();     // <-- comment this out once, on purpose
      System.out.println("Transcript saved: " + turnNumber + " turns.");
   }
}
