package chapter09.demo;

/**
 * CHAPTER 9, STEP 2  -  Gaddis 9.4 (the StringBuilder class)
 *
 * A String cannot be changed. Every "+=" builds a whole new String and
 * throws the old one away. In a loop that is quadratic work.
 * StringBuilder edits one buffer in place.
 *
 * Predict the ratio before running. Then run it more than once and explain
 * why timing measurements are not identical on every run.
 */
public class Step2_StringBuilder
{
   public static void main(String[] args)
   {
      final int N = 40000;

      long start = System.currentTimeMillis();
      String slow = "";
      for (int i = 0; i < N; i++)
      {
         slow = slow + "x";              // a brand new String, every time
      }
      long slowTime = System.currentTimeMillis() - start;

      start = System.currentTimeMillis();
      StringBuilder fast = new StringBuilder();
      for (int i = 0; i < N; i++)
      {
         fast.append("x");               // edits the same buffer
      }
      long fastTime = System.currentTimeMillis() - start;

      System.out.println("Building a " + N + " character string:");
      System.out.println("  String  +=      : " + slowTime + " ms");
      System.out.println("  StringBuilder   : " + fastTime + " ms");
      System.out.println();
      System.out.println("Same length? " + (slow.length() == fast.length()));
      System.out.println();
      System.out.println("Strings are immutable. Every += made a new one.");
   }
}
