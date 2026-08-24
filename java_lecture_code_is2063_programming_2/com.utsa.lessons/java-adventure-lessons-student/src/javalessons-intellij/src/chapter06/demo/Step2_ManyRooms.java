package chapter06.demo;

/**
 * LESSON 5, STEP 2  -  Gaddis Ch. 6.3 (each object has its own fields)
 *
 * Three objects from one class. Each has its own copy of name,
 * description, and exits.
 *
 * Before running, draw three object boxes with three fields in each. Fill in
 * the values and verify the diagram against the output.
 */
public class Step2_ManyRooms
{
   public static void main(String[] args)
   {
      Room library = new Room("THE OLD LIBRARY",
                              "Dust hangs in the light from a high window.",
                              "north, east");

      Room gallery = new Room("THE GALLERY",
                              "Portraits watch you from both walls.",
                              "south");

      Room storeroom = new Room("THE STOREROOM",
                                "A heavy chest sits in the corner.",
                                "west");

      library.describe();
      System.out.println();
      gallery.describe();
      System.out.println();
      storeroom.describe();

      System.out.println();
      System.out.println("Three objects. One class. Each keeps its own data.");
   }
}
