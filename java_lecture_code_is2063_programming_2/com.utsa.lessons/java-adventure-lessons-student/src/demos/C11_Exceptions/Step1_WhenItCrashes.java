package demos.C11_Exceptions;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * CHAPTER 11, STEP 1  -  Gaddis 11.1 (handling exceptions)
 *
 * PREDICTION: this program deliberately opens a missing file. Run it once and
 * use the resulting stack trace as diagnostic evidence.
 *
 * There is no missing_file.txt. There never was. The program dies.
 *
 * Read the stack trace and identify:
 *   - what went wrong (FileNotFoundException)
 *   - which file it wanted
 *   - which line of YOUR code asked for it
 *
 * A stack trace records what failed and the path of method calls to that point.
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
