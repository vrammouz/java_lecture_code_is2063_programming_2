package chapter10.demo;

import java.util.ArrayList;

/**
 * CHAPTER 10, STEP 3  -  why anyone bothers.
 *
 * Compare this against Step2_Polymorphism. The only difference is ONE
 * added line. "dance" now works.
 *
 * What would the switch version require changing? Which design better
 * isolates the risk of adding one feature?
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
