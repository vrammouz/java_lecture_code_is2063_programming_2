package demos.C08_References;

/**
 * CHAPTER 8, STEP 2  -  Gaddis 8.5, passing object references to methods
 *
 * Review the Chapter 5 pass-by-value example before running this one.
 * Java passes a copy of the value, so a method
 * could not change the caller's int.
 *
 * That rule has not changed. Java still passes a copy.
 * But when the value IS a reference, the copy points at the SAME object --
 * so the method can reach through it and change what it finds.
 *
 * Predict all three results before running, then explain each with a memory
 * diagram showing copied references and objects.
 */
public class Step2_PassingObjects
{
   public static void main(String[] args)
   {
      Player hero = new Player("Ida", 100);

      System.out.println("Start          : " + hero);

      hurt(hero);
      System.out.println("After hurt()   : " + hero);      // ??? changed?

      replace(hero);
      System.out.println("After replace(): " + hero);      // ??? changed?

      hero = returnNew(hero);
      System.out.println("After assign   : " + hero);      // ??? changed?
   }

   /** Reaches THROUGH the copied reference. The caller sees this. */
   public static void hurt(Player p)
   {
      p.takeDamage(25);
   }

   /** Reassigns the copied reference. The caller sees NOTHING. */
   public static void replace(Player p)
   {
      p = new Player("Someone Else", 1);
      System.out.println("   inside replace: " + p);
   }

   /** The version that works by returning. */
   public static Player returnNew(Player p)
   {
      return new Player("Ida the Bold", p.getHealth());
   }
}
