package demos.C10_Polymorphism;

public class LookCommand implements Command
{
   public String getWord() { return "look"; }

   public void execute()
   {
      System.out.println("Dust hangs in the light from a high window.");
   }
}
