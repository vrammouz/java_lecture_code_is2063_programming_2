package demos.C10_Polymorphism;

import java.util.ArrayList;

/**
 * CHAPTER 10, STEP 3  -  why anyone bothers.
 *
 * Compare this against Step2_Polymorphism. Locate the smallest change that
 * makes "dance" work. Then list every change the switch version would need.
 */
public class Step3_AddingIsEasy
{
   public static void main(String[] args)
   {
      ArrayList<Command> commands = new ArrayList<Command>();
      commands.add(new LookCommand());
      commands.add(new GoNorthCommand());
      commands.add(new InventoryCommand());
      commands.add(new QuitCommand());
      commands.add(new DanceCommand());        // <-- the entire change

      String[] script = {"look", "north", "inventory", "dance", "quit"};

      for (String word : script)
      {
         System.out.print("> " + word + "  ->  ");
         run(commands, word);
      }
   }

   public static void run(ArrayList<Command> commands, String word)
   {
      for (Command c : commands)
      {
         if (c.getWord().equals(word))
         {
            c.execute();
            return;
         }
      }
      System.out.println("You cannot do that here.");
   }
}
