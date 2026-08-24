package chapter08.lab;

/** LAB (Ch. 8) -- provided. Do not modify. */
public class Chest
{
   private String label;
   private int coins;

   public Chest(String chestLabel, int startingCoins)
   {
      label = chestLabel;
      coins = startingCoins;
   }

   public String getLabel() { return label; }
   public int getCoins() { return coins; }

   public void take(int amount) { coins = coins - amount; }
   public void put(int amount)  { coins = coins + amount; }

   public String toString() { return label + "[" + coins + "]"; }
}
