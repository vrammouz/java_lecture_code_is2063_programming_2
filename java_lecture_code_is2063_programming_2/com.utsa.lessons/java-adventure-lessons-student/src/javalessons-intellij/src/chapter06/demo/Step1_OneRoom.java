package chapter06.demo;

/**
 * LESSON 5, STEP 1  -  Gaddis Ch. 6.1-6.3
 *
 * One class, one object. Compile Room.java first (or together).
 *
 * Room describes what every room object has. The expression beginning with
 * new creates one particular Room object. Find both roles in main.
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
