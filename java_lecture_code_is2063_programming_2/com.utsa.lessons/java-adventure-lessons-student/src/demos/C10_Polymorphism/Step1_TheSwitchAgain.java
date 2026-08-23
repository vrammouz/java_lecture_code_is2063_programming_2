package demos.C10_Polymorphism;

/**
 * CHAPTER 10, STEP 1  -  the switch from Chapter 3, back again.
 *
 * Compare this with Chapter 3 Step3_Switch before continuing.
 *
 * Note what is wrong with this code: to add ONE new command you must
 * edit this method. Every new feature makes this one place bigger and
 * harder to maintain.
 */
public class Step1_TheSwitchAgain
{
   public static void main(String[] args)
   {
      String[] script = {"look", "north", "inventory", "dance", "quit"};

      for (String command : script)
      {
         System.out.print("> " + command + "  ->  ");
         respondTo(command);
      }
   }

   public static void respondTo(String command)
   {
      switch (command)
      {
         case "look":
            System.out.println("Dust hangs in the light from a high window.");
            break;
         case "north":
            System.out.println("You climb the stair to the gallery.");
            break;
         case "inventory":
            System.out.println("You are carrying a lantern.");
            break;
         case "quit":
            System.out.println("You step out into the rain.");
            break;
         default:
            System.out.println("You cannot do that here.");
      }
   }
}
