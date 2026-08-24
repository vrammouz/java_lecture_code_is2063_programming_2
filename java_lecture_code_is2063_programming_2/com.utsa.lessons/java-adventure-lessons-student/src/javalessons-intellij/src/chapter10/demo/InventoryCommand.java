package chapter10.demo;

public class InventoryCommand implements Command
{
   public String getWord() { return "inventory"; }

   public void execute()
   {
      System.out.println("You are carrying a lantern.");
   }
}
