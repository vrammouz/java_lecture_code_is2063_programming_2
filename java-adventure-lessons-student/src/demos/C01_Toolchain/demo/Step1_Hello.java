package demos.C01_Toolchain.demo;

/**
 * CHAPTER 1  -  Gaddis 1.1-1.6 (programs, the JVM, Java's portability)
 *
 * The point of this file is not the output. It is the CEREMONY:
 *   javac Step1_Hello.java     -> produces Step1_Hello.class
 *   java  Step1_Hello          -> runs the .class
 *
 * Show the .class file appear in the folder. That file is the whole
 * "write once, run anywhere" story in one object you can point at.
 */
public class Step1_Hello
{
   public static void main(String[] args)
   {
      System.out.println("The compiler ran. The JVM ran. You are in business.");
   }
}
