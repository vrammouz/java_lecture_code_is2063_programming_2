package demos.C08_References;

import java.util.Objects;

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

   public void takeDamage(int points)
   {
      if (points < 0)
         throw new IllegalArgumentException("Damage cannot be negative.");
      health = Math.max(0, health - points);
   }

   /** Gaddis 8.7 -- toString is called automatically by println. */
   @Override
   public String toString()
   {
      return name + "(" + health + ")";
   }

   /** Gaddis 8.8 -- what "the same player" should mean for THIS class. */
   @Override
   public boolean equals(Object object)
   {
      if (this == object) return true;
      if (!(object instanceof Player)) return false;
      Player other = (Player) object;
      return health == other.health && name.equals(other.name);
   }

   @Override
   public int hashCode()
   {
      return Objects.hash(name, health);
   }
}
