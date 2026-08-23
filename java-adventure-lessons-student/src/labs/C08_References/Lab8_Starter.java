package labs.C08_References;

/**
 * LAB (Ch. 8)  -  the aliasing bug hunt.
 *
 * THIS PROGRAM HAS A BUG.
 *
 * The guild keeps 200 coins in the vault. Before the raid they make a
 * BACKUP RECORD of what was in there. Then the raid empties the vault.
 * The backup should still show 200 -- that is the whole point of a backup.
 *
 * It does not. The record of what they used to have is gone.
 *
 * YOUR TASK
 * ---------
 * 1. Run it. The backup should say 200 and it does not.
 * 2. DRAW the memory diagram -- boxes for objects, arrows for references --
 *    as it is at the moment vault.take(200) runs. Photograph or scan it.
 * 3. Write one sentence naming the cause.
 * 4. Fix it by adding a copy constructor to Chest and using it.
 *    (You may add to Chest for this step.)
 * 5. Override equals(Object) and hashCode() in Chest. Demonstrate that a
 *    fresh 200-coin chest can be equal in value but is not the same object.
 * 6. Decide whether the label is part of a chest's identity. Defend your
 *    decision with one example where the choice changes the result.
 *
 * DONE WHEN: vault reads 0, backup reads 200, your diagram is attached,
 * and your one-sentence cause is at the top of this file.
 */
public class Lab8_Starter
{
   public static void main(String[] args)
   {
      Chest vault = new Chest("vault", 200);

      // "Write down what we have, before anything happens to it."
      Chest backup = vault;              // <-- look here

      System.out.println("Before the raid:");
      System.out.println("   vault  : " + vault);
      System.out.println("   backup : " + backup);

      vault.take(200);                   // the raid empties the vault

      System.out.println();
      System.out.println("After the raid:");
      System.out.println("   vault  : " + vault);
      System.out.println("   backup : " + backup);
      System.out.println();
      System.out.println("Expected vault[0] and backup[200].");
   }
}
