package demos.C08_References;

/**
 * CHAPTER 8, STEP 1  -  Gaddis 8.5 (objects and references), aliasing
 *
 * *** PAUSE AND PREDICT BOTH LINES BEFORE RUNNING. ***
 *
 * Draw this on screen as you go:
 *
 *    a  ──────┐
 *             ├──> [ Player: Ida, 100 ]
 *    b  ──────┘
 *
 * ONE object. TWO names for it. Damage it through one name and the other
 * name sees the change, because there was only ever one object.
 */
public class Step1_Aliasing
{
   public static void main(String[] args)
   {
      Player a = new Player("Ida", 100);
      Player b = a;                       // NOT a new player. A second name.

      System.out.println("a = " + a);
      System.out.println("b = " + b);

      System.out.println();
      System.out.println("Now: a.takeDamage(40)");
      a.takeDamage(40);

      System.out.println("a = " + a);
      System.out.println("b = " + b);     // ??? predict this
      System.out.println();
      System.out.println("Same object? a == b is " + (a == b));

      System.out.println();
      System.out.println("Compare with a REAL second player:");
      Player c = new Player("Ida", 60);
      System.out.println("c = " + c + "   a == c is " + (a == c));
      System.out.println("but a.equals(c) is " + a.equals(c));
   }
}
