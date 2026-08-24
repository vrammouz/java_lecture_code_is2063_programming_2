package chapter07.demo;

/** Same Room class from Chapter 6, reused here. */
public class Room
{
   private String name;
   private String description;
   private String exits;

   public Room(String roomName, String roomDescription, String roomExits)
   {
      name = roomName;
      description = roomDescription;
      exits = roomExits;
   }

   public String getName() { return name; }
   public String getDescription() { return description; }
   public String getExits() { return exits; }

   public void describe()
   {
      System.out.println(name + " -- " + description + " (exits: " + exits + ")");
   }
}
