package labs.C11_Exceptions;

import java.io.File;
import java.util.Scanner;

/**
 * LAB (Ch. 11)  -  survive a filthy file.
 *
 * scores_messy.txt contains numbers, blank lines, and junk.
 *
 * YOUR TASK
 * ---------
 * 1. Read every line. Total the ones that are valid integers.
 * 2. Catch NumberFormatException for junk lines. Report each one with its
 *    line number, then CARRY ON -- do not stop reading.
 * 3. Catch FileNotFoundException separately. Test it by renaming the file.
 * 4. Use finally to close the Scanner and print a closing message.
 * 5. Write your own exception class  EmptyLineException  and throw it for
 *    blank lines, so blanks and junk are reported differently.
 * 6. Print: total, count of valid numbers, count of junk, count of blanks.
 *
 * DONE WHEN: the total is 197, junk = 2, blanks = 1, and renaming the file
 * gives a clean message rather than a stack trace.
 */
public class Lab11_Starter
{
   public static void main(String[] args)
   {
      // TODO
   }
}
