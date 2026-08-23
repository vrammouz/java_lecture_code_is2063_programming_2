package demos.C09_Text;

/**
 * CHAPTER 9, STEP 3  -  Gaddis 9.5-9.6 (wrapper classes, autoboxing)
 *
 * Everything read from a file is text. Turning "42" into 42 is a
 * conversion needed when text represents a numeric value. Test one valid,
 * one negative, one decimal, and one nonnumeric input.
 */
public class Step3_Wrappers
{
   public static void main(String[] args)
   {
      String fromFile = "42";

      int coins = Integer.parseInt(fromFile);
      System.out.println("parsed  : " + coins);
      System.out.println("doubled : " + (coins * 2));

      System.out.println();
      System.out.println("What if the file is wrong?");
      String bad = "forty-two";
      try
      {
         int broken = Integer.parseInt(bad);
         System.out.println(broken);
      }
      catch (NumberFormatException e)
      {
         System.out.println("  CRASH: cannot parse [" + bad + "]");
         System.out.println("  Chapter 11 is where we handle this properly.");
      }

      System.out.println();
      System.out.println("Useful constants and helpers:");
      System.out.println("  Integer.MAX_VALUE  : " + Integer.MAX_VALUE);
      System.out.println("  Character.isDigit  : " + Character.isDigit('7'));
      System.out.println("  Character.isLetter : " + Character.isLetter('7'));
      System.out.println("  Double.parseDouble : " + Double.parseDouble("3.5"));
   }
}
