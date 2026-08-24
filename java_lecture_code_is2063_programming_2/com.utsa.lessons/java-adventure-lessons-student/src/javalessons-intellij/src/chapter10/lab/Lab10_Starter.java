package chapter10.lab;

/**
 * LAB (Ch. 10)  -  delete a switch.
 *
 * Below is a working scoring method with a five-branch if-chain.
 *
 * YOUR TASK
 * ---------
 * 1. Define an interface  Scorer  with a method  int score(int base).
 *    If Scorer is a separate file, create it inside chapter10.lab.
 * 2. Write one small class per rule, each implementing Scorer.
 * 3. Replace the if-chain with a loop over an ArrayList<Scorer>.
 * 4. The output must be IDENTICAL to the original. Save it first and compare.
 * 5. Then add a SIXTH rule by writing one new class and adding one line.
 *    Do not edit any existing class to do it.
 *
 * DONE WHEN: output matches for the original five, the sixth rule works,
 * and no if-chain over rule names remains anywhere.
 */
public class Lab10_Starter
{
   public static void main(String[] args)
   {
      String[] rules = {"double", "bonus", "penalty", "half", "cap"};
      int base = 50;

      for (String rule : rules)
      {
         System.out.println(rule + " -> " + applyRule(rule, base));
      }
   }

   public static int applyRule(String rule, int base)
   {
      if (rule.equals("double"))
         return base * 2;
      else if (rule.equals("bonus"))
         return base + 25;
      else if (rule.equals("penalty"))
         return base - 15;
      else if (rule.equals("half"))
         return base / 2;
      else if (rule.equals("cap"))
         return Math.min(base, 40);
      else
         return base;
   }
}
