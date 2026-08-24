package chapter10.demo;

/**
 * CHAPTER 10  -  Gaddis 10.8 (abstract classes) / interfaces
 *
 * A contract. Anything that calls itself a Command must be able to say
 * what word triggers it, and must be able to run.
 */
public interface Command
{
   String getWord();
   void execute();
}
