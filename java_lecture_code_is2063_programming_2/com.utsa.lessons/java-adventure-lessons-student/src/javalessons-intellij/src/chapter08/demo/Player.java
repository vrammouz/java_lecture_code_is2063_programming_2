package chapter08.demo;

/** Chapter 8 demo class. Deliberately mutable so aliasing is visible. */
public class Player
{
   private String name;
   private int health;

   public Player(String playerName, int startingHealth)
   {
      name = playerName;
      health = startingHealth;
   }

   /** Copy constructor -- Gaddis 8.6 */
   public Player(Player other)
   {
      name = other.name;
      health = other.health;
   }

   public String getName() { return name; }
   public int getHealth() { return health; }

   public void takeDamage(int points) { health = health - points; }

   /** Gaddis 8.7 -- toString is called automatically by println. */
   public String toString()
   {
      return name + "(" + health + ")";
   }

   /** Gaddis 8.8 -- what "the same player" should mean for THIS class. */
   public boolean equals(Player other)
   {
      return name.equals(other.name) && health == other.health;
   }
}
