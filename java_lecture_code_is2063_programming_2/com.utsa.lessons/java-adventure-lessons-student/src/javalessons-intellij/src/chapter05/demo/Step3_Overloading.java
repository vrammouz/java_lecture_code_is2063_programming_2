package chapter05.demo;

/**
 * LESSON 4, STEP 3  -  Gaddis Ch. 5.4-5.5, and overloading (Ch. 6.6 preview)
 *
 * Three methods, one name. Java picks by the argument list.
 * Keep this short -- it is a convenience, not a big idea.
 */
public class Step3_Overloading
{
   public static void main(String[] args)
   {
      describe("THE OLD LIBRARY");
      describe("THE GALLERY", "Portraits watch you from both walls.");
      describe("THE STOREROOM", "A heavy chest sits in the corner.", 2);
   }

   public static void describe(String name)
   {
      System.out.println(name);
   }

   public static void describe(String name, String detail)
   {
      System.out.println(name);
      System.out.println("   " + detail);
   }

   public static void describe(String name, String detail, int exitCount)
   {
      System.out.println(name);
      System.out.println("   " + detail);
      System.out.println("   Exits available: " + exitCount);
   }
}
