package chapter06.demo;

/**
 * LESSON 5  -  Gaddis Ch. 6.2-6.4
 *              (writing a simple class, instance fields and methods, constructors)
 *
 * Gaddis builds a class step by step in 6.2. This follows the same shape.
 *
 * Read this UML before the code. Match each row to one declaration below:
 *
 *    +---------------------------------+
 *    | Room                            |
 *    +---------------------------------+
 *    | - name : String                 |
 *    | - description : String          |
 *    | - exits : String                |
 *    +---------------------------------+
 *    | + Room(String, String, String)  |
 *    | + getName() : String            |
 *    | + getDescription() : String     |
 *    | + getExits() : String           |
 *    | + describe() : void             |
 *    +---------------------------------+
 */
public class Room
{
   // Instance fields -- private, per Gaddis 6.3. One set per object.
   private String name;
   private String description;
   private String exits;

   /** Constructor -- Gaddis 6.4. Same name as the class, no return type. */
   public Room(String roomName, String roomDescription, String roomExits)
   {
      name = roomName;
      description = roomDescription;
      exits = roomExits;
   }

   /** Accessor ("getter") */
   public String getName()
   {
      return name;
   }

   public String getDescription()
   {
      return description;
   }

   public String getExits()
   {
      return exits;
   }

   /** An instance method that DOES something with this object's own fields. */
   public void describe()
   {
      System.out.println(name);
      System.out.println("   " + description);
      System.out.println("   Exits: " + exits);
   }
}
