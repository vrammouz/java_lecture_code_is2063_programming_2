package chapter10.demo;

public class GoNorthCommand implements Command
{
   public String getWord() { return "north"; }

   public void execute()
   {
      System.out.println("You climb the stair to the gallery.");
   }
}
