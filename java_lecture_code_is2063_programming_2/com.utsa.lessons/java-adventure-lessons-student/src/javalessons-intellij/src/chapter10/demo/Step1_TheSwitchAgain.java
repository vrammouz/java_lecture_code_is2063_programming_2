package chapter10.demo;

/**
 * CHAPTER 10, STEP 1  -  the switch from Chapter 3, back again.
 *
 * Compare this with Chapter 3 Step 3. To add ONE new command you must
 * edit this method. Every new feature makes this one place bigger and
 * more dangerous. Mark every line that a new command could require changing.
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
