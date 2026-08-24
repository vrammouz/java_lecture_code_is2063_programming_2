package chapter04.lab;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * LAB 3 STARTER  -  Gaddis Ch. 4
 *
 * YOUR TASK
 * ---------
 * 1. Read every line of items.txt and print it with a line number.
 * 2. Count the items and print the total at the end.
 * 3. Add a game loop: the player types an item name, and you say whether
 *    that item is in the file. (Read the file again each time -- that is
 *    wasteful, and noticing WHY it is wasteful is part of the point.)
 * 4. The loop ends when the player types "quit".
 *
 * DONE WHEN: it reads the file, counts correctly, and the search works for
 * at least one item that IS in the file and one that is not.
 *
 * WATCH OUT: comparing Strings. You learned this in Lab 2.
 */
public class Lab3_Starter
{
   public static void main(String[] args) throws IOException
   {
      Scanner keyboard = new Scanner(System.in);

      // TODO: your code here
      // Use openItemsFile() whenever you need a new Scanner for items.txt.

   }

   /** Opens the data file from this package, independent of the working directory. */
   public static Scanner openItemsFile() throws FileNotFoundException
   {
      InputStream resource = Lab3_Starter.class.getResourceAsStream("items.txt");
      if (resource == null)
         throw new FileNotFoundException("items.txt resource not found");
      return new Scanner(resource);
   }
}
