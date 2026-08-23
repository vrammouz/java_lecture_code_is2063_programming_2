package demos.C01_Toolchain.broken;

/**
 * CHAPTER 1  -  ON PURPOSE, THIS DOES NOT COMPILE.
 *
 * Compile this file and read each diagnostic carefully.
 * There are exactly two mistakes. Find them from the message alone.
 *
 * Record the filename, line number, and problem reported for each mistake.
 */
public class Step2_WontCompile
{
   public static void main(String[] args)
   {
      System.out.println("first line is fine")
      System.out.println("but something above me is missing);
   }
}
