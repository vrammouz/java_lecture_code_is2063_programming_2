package chapter05.demo;

/**
 * LESSON 4, STEP 2  -  Gaddis Ch. 5.2 (passing arguments to a method)
 *
 * Predict and write down all four numbers before running the program.
 * If a prediction is wrong, trace the parameter and the caller's variable
 * as two separate boxes before reading the explanation below.
 *
 * Java passes a COPY of the value. Always. No exceptions.
 * In Ch. 8 we will discover what that means when the value is a reference,
 * and the answer surprises people all over again.
 */
public class Step2_PassByValue
{
   public static void main(String[] args)
   {
      int health = 100;

      System.out.println("Before  : " + health);
      damage(health);
      System.out.println("After   : " + health);      // ??? predict this

      health = damageAndReturn(health);
      System.out.println("Returned: " + health);      // and this
   }

   /** Looks like it changes health. It does not. */
   public static void damage(int points)
   {
      points = points - 30;
      System.out.println("Inside  : " + points);
   }

   /** The version that actually works, because the caller reassigns. */
   public static int damageAndReturn(int points)
   {
      return points - 30;
   }
}
