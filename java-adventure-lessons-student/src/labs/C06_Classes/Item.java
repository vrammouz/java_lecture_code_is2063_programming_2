package labs.C06_Classes;

/**
 * LAB 5 -- provided class. Do not modify this file.
 */
public class Item
{
   private String name;
   private int weight;

   public Item(String itemName, int itemWeight)
   {
      name = itemName;
      weight = itemWeight;
   }

   public String getName()
   {
      return name;
   }

   public int getWeight()
   {
      return weight;
   }
}
