package chapter07.demo;

/**
 * CHAPTER 7, STEP 3  -  Gaddis 7.7 (arrays of objects)
 *
 * *** THE MOST IMPORTANT THING IN CHAPTER 7, AND IT IS EASY TO MISS. ***
 *
 * "new Room[3]" does NOT make three rooms.
 * It makes three empty slots that could each hold a reference to a room.
 * They start out holding null.
 *
 * PREDICT BEFORE RUNNING: what does the second block print?
 */
public class Step3_ArrayOfObjects
{
   public static void main(String[] args)
   {
      Room[] rooms = new Room[3];

      System.out.println("Just after 'new Room[3]':");
      for (int i = 0; i < rooms.length; i++)
      {
         System.out.println("  slot " + i + " holds: " + rooms[i]);
      }

      System.out.println();
      System.out.println("Calling a method on an empty slot:");
      try
      {
         rooms[0].describe();
      }
      catch (NullPointerException e)
      {
         System.out.println("  CRASH: NullPointerException");
         System.out.println("  The slot exists. The object does not.");
      }

      System.out.println();
      System.out.println("Now we actually create the objects:");
      rooms[0] = new Room("THE OLD LIBRARY", "Dust in the light.", "north");
      rooms[1] = new Room("THE GALLERY", "Portraits watch you.", "south");
      rooms[2] = new Room("THE STOREROOM", "A heavy chest.", "west");

      for (Room r : rooms)
      {
         r.describe();
      }
   }
}
