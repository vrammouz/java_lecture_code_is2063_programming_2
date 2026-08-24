package chapter09.demo;

/**
 * CHAPTER 9, STEP 1  -  Gaddis 9.1-9.2 (character testing, String methods),
 *                       and split / trim / substring
 *
 * Real data files are filthy. This is the skill that makes Build 3 possible.
 */
public class Step1_ParsingALine
{
   public static void main(String[] args)
   {
      String line = "  THE OLD LIBRARY | Dust in the light. | north,east  ";

      System.out.println("Raw    : [" + line + "]");
      System.out.println("Trimmed: [" + line.trim() + "]");
      System.out.println();

      String[] parts = line.trim().split("\\|");
      System.out.println("Split into " + parts.length + " parts:");
      for (int i = 0; i < parts.length; i++)
      {
         System.out.println("  " + i + ": [" + parts[i].trim() + "]");
      }

      System.out.println();
      String[] exits = parts[2].trim().split(",");
      System.out.println("Exits (" + exits.length + "):");
      for (String e : exits)
      {
         System.out.println("  -> " + e.trim());
      }

      System.out.println();
      System.out.println("toUpperCase : " + parts[1].trim().toUpperCase());
      System.out.println("indexOf     : " + parts[1].indexOf("light"));
      System.out.println("startsWith  : " + parts[0].trim().startsWith("THE"));
   }
}
