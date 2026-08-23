package demos.C10_Polymorphism;

public class QuitCommand implements Command
{
   public String getWord() { return "quit"; }

   public void execute()
   {
      System.out.println("You step out into the rain.");
   }
}
