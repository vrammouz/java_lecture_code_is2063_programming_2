package labs.C09_Text;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * LAB (Ch. 9)  -  parse a messy file.
 *
 * rooms_messy.txt has four rooms, one per line, in the format:
 *      name | description | comma-separated exits | coin count
 * The spacing is inconsistent on purpose. Real files are like this.
 *
 * YOUR TASK
 * ---------
 * 1. Read the file line by line.
 * 2. Split each line on the pipe character and trim every piece.
 * 3. Convert the coin count to an int.
 * 4. Print each room tidily, with its exits listed one per line.
 * 5. Print the TOTAL coins across all rooms.
 * 6. Use a StringBuilder to build one summary String of all room names,
 *    then print it once at the end.
 *
 * DONE WHEN: all four rooms print cleanly with no stray spaces, the total
 * is 20, and the summary line prints.
 *
 * HINT: to split on a pipe you need  split("\\|")  -- a bare "|" means
 * something special in a pattern.
 */
public class Lab9_Starter
{
   public static void main(String[] args) throws IOException
   {
      // TODO
   }
}
