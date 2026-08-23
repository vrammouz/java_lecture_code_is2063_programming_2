package demos.C10_Polymorphism;

/**
 * CHAPTER 10, STEP 3  -  the new feature.
 *
 * This class is the ENTIRE change needed to add a new command.
 * No existing file is edited except the one line that registers it.
 * Compare that with editing the switch.
 */
public class DanceCommand implements Command
{
   public String getWord() { return "dance"; }

   public void execute()
   {
      System.out.println("You perform a small jig. The portraits disapprove.");
   }
}
