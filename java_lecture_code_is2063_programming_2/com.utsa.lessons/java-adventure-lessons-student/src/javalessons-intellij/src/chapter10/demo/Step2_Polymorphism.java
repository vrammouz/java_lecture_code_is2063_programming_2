package chapter10.demo;

import java.util.ArrayList;

/**
 * CHAPTER 10, STEP 2  -  Gaddis 10.4-10.5 (polymorphism, dynamic binding)
 *
 * Identical output to Step1_TheSwitchAgain. The switch is gone.
 *
 * The if-chain asked which kind of command it had. Now each object already
 * knows how to run. Identify where dynamic binding selects execute at runtime.
 */
public class Step2_Polymorphism
{
   public static void main(String[] args)
   {
      ArrayList<Command> commands = new ArrayList<Command>();
      commands.add(new LookCommand());
      commands.add(new GoNorthCommand());
      commands.add(new InventoryCommand());
      commands.add(new QuitCommand());

      String[] script = {"look", "north", "inventory", "dance", "quit"};

      for (String word : script)
      {
         System.out.print("> " + word + "  ->  ");
         run(commands, word);
      }
   }

   /** Note: no switch, no if-chain over command names. */
   public static void run(ArrayList<Command> commands, String word)
   {
      for (Command c : commands)
      {
         if (c.getWord().equals(word))
         {
            c.execute();          // which execute()? decided at run time.
            return;
         }
      }
      System.out.println("You cannot do that here.");
   }
}
