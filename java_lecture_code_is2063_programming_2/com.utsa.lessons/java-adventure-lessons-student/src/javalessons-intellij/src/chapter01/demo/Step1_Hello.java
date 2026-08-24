package chapter01.demo;

/**
 * CHAPTER 1  -  Gaddis 1.1-1.6 (programs, the JVM, Java's portability)
 *
 * The point of this file is not the output. It is the CEREMONY:
 *   javac Step1_Hello.java     -> produces Step1_Hello.class
 *   java  Step1_Hello          -> runs the .class
 *
 * After compiling, find the new .class file. Explain why javac creates it
 * and why the java command runs that file rather than the .java source.
 */
public class Step1_Hello
{
   public static void main(String[] args)
   {
      System.out.println("The compiler ran. The JVM ran. You are in business.");
   }
}
