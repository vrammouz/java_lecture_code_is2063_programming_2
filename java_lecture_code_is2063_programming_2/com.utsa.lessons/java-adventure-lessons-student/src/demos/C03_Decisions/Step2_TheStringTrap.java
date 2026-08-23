package demos.C03_Decisions;

/**
 * LESSON 2, STEP 2  -  Gaddis Ch. 3.6 (comparing String objects)
 *
 * PREDICTION: write down the expected value of all four comparisons before
 * running the program. Then explain why == and equals() differ.
 *
 * Gaddis explains this in 3.6. It is also the seed of everything in Ch. 8.
 */
public class Step2_TheStringTrap
{
   public static void main(String[] args)
   {
      String a = "north";
      String b = "north";

      // Built at run time from pieces -- same characters, different object.
      String c = "nor" + someLetters();

      System.out.println("a.equals(b) : " + a.equals(b));
      System.out.println("a == b      : " + (a == b));
      System.out.println("a.equals(c) : " + a.equals(c));
      System.out.println("a == c      : " + (a == c));

      System.out.println();
      System.out.println("The characters are identical in every case.");
      System.out.println("== asks 'are these the SAME OBJECT?'");
      System.out.println(".equals() asks 'do these HAVE THE SAME CONTENTS?'");
   }

   private static String someLetters()
   {
      return "th";
   }
}
