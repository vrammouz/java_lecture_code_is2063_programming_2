package demos.C06_Classes;

/**
 * LESSON 5, STEP 1  -  Gaddis Ch. 6.1-6.3
 *
 * One class, one object. Compile Room.java first (or together).
 *
 * Room describes what every room object contains and can do. The expression
 * beginning with new constructs one particular Room object.
 */
public class Step1_OneRoom
{
   public static void main(String[] args)
   {
      Room library = new Room("THE OLD LIBRARY",
                              "Dust hangs in the light from a high window.",
                              "north, east");

      library.describe();

      System.out.println();
      System.out.println("Asking the object for one field: " + library.getName());
   }
}
