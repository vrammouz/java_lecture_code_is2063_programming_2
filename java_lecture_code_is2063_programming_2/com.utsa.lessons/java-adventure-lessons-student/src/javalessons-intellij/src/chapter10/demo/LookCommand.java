package chapter10.demo;

public class LookCommand implements Command
{
   public String getWord() { return "look"; }

   public void execute()
   {
      System.out.println("Dust hangs in the light from a high window.");
   }
}
