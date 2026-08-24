package chapter11.demo;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * CHAPTER 11, STEP 1  -  Gaddis 11.1 (handling exceptions)
 *
 * *** RUN THIS FIRST AND LET IT CRASH. ***
 *
 * There is no missing_file.txt. There never was. The program dies.
 *
 * Then READ THE STACK TRACE OUT LOUD, bottom to top:
 *   - what went wrong (FileNotFoundException)
 *   - which file it wanted
 *   - which line of YOUR code asked for it
 *
 * Say: "A stack trace is not the computer shouting at you. It is a
 *       receipt showing exactly what it tried to do and where it stopped."
 */
public class Step1_WhenItCrashes
{
   public static void main(String[] args) throws IOException
   {
      System.out.println("About to open a file that does not exist...");

      Scanner inputFile = new Scanner(new File("missing_file.txt"));

      System.out.println("This line never runs.");
      inputFile.close();
   }
}
