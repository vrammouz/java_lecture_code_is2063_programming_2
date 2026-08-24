package chapter11.demo;

/**
 * CHAPTER 11, STEP 3  -  Gaddis 11.3 (custom exceptions)
 *
 * Why bother? Because "BadRoomFileException: line 3 is not a valid room"
 * tells the caller far more than a bare NumberFormatException, and the
 * caller can decide to skip that line rather than abandon the file.
 *
 * For each failure, ask which method has enough context to decide what to do.
 */
public class Step3_YourOwnException
{
   public static void main(String[] args)
   {
      String[] fileLines = {
         "THE OLD LIBRARY|Dust in the light.|north",
         "THE GALLERY|Portraits watch you.|south",
         "this line is broken",
         "THE STOREROOM|A heavy chest.|west"
      };

      int loaded = 0;
      int skipped = 0;

      for (int i = 0; i < fileLines.length; i++)
      {
         try
         {
            checkLine(i + 1, fileLines[i]);
            System.out.println("OK   line " + (i + 1));
            loaded++;
         }
         catch (BadRoomFileException e)
         {
            System.out.println("SKIP " + e.getMessage());
            skipped++;
         }
      }

      System.out.println();
      System.out.println("Loaded " + loaded + " rooms, skipped " + skipped + ".");
      System.out.println("One bad line did not destroy the whole file.");
   }

   /** Throws if the line does not have three pipe-separated parts. */
   public static void checkLine(int lineNumber, String line)
          throws BadRoomFileException
   {
      String[] parts = line.split("\\|");
      if (parts.length != 3)
      {
         throw new BadRoomFileException(lineNumber, line);
      }
   }
}
