package demos.C08_References;

/**
 * CHAPTER 8, STEP 3  -  Gaddis 8.6 (copy constructors), 8.7 (toString),
 *                       8.8 (equals)
 *
 * The fix for accidental aliasing: make a real copy when you want one.
 */
public class Step3_CopyAndEquals
{
   public static void main(String[] args)
   {
      Player original = new Player("Ida", 100);

      Player alias = original;                    // second name, same object
      Player copy   = new Player(original);       // genuine second object

      System.out.println("original == alias : " + (original == alias));
      System.out.println("original == copy  : " + (original == copy));
      System.out.println("original.equals(copy) : " + original.equals(copy));

      System.out.println();
      System.out.println("Damage the ORIGINAL by 50, then look at both:");
      original.takeDamage(50);

      System.out.println("  original : " + original);
      System.out.println("  alias    : " + alias + "   <- moved with it");
      System.out.println("  copy     : " + copy + "   <- did not move");

      System.out.println();
      System.out.println("equals() now? " + original.equals(copy));
   }
}
