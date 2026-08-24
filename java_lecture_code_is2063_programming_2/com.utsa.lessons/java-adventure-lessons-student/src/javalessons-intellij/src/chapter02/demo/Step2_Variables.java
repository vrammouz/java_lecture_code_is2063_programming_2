package chapter02.demo;

/**
 * LESSON 1, STEP 2  -  Gaddis Ch. 2.3-2.4, 2.8-2.9
 *                      (variables, primitive types, final, the String class)
 *
 * Same output, but the text is now DATA instead of being baked into the code.
 * This is the first hint of the whole course: separate what a thing IS from
 * what you DO with it.
 */
public class Step2_Variables
{
   public static void main(String[] args)
   {
      // A named constant -- Gaddis 2.8. Cannot be reassigned.
      final int STARTING_HEALTH = 100;

      // Reference variables holding String objects -- Gaddis 2.9
      String roomName = "THE OLD LIBRARY";
      String description = "Dust hangs in the light from a high window.";
      String exits = "north, east";

      // Primitives -- Gaddis 2.4
      int health = STARTING_HEALTH;
      int itemsCarried = 0;
      boolean hasLantern = false;

      System.out.println(roomName);
      System.out.println();
      System.out.println(description);
      System.out.println("Exits: " + exits);
      System.out.println();
      System.out.println("Health: " + health + "   Items: " + itemsCarried);
      System.out.println("Carrying a lantern? " + hasLantern);
   }
}
