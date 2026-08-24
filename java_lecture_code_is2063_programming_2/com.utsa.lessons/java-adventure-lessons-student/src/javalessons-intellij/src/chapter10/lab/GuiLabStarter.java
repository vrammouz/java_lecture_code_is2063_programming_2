package chapter10.lab;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingUtilities;

/**
 * GUI CHALLENGE (Ch. 10): remove the rule-name if-chain.
 *
 * 1. Record every result before refactoring.
 * 2. Define a Scorer interface with getName and score methods.
 * 3. Write one small class for each scoring rule.
 * 4. Fill the combo box from an array or ArrayList of Scorer objects.
 * 5. Add a sixth rule without editing any existing scorer class.
 *
 * THINK: after the refactor, which code changes when a rule is added, and
 * which code is protected from that change?
 */
public class GuiLabStarter
{
   public static void main(String[] args)
   {
      SwingUtilities.invokeLater(() -> createWindow());
   }

   public static void createWindow()
   {
      String[] rules = {"double", "bonus", "penalty", "half", "cap"};
      JComboBox<String> ruleBox = new JComboBox<String>(rules);
      JSpinner baseSpinner = new JSpinner(new SpinnerNumberModel(50, 0, 1000, 1));
      JLabel result = new JLabel("Choose a rule.");
      JButton scoreButton = new JButton("Score");

      scoreButton.addActionListener(event -> {
         String rule = (String) ruleBox.getSelectedItem();
         int base = (Integer) baseSpinner.getValue();
         result.setText(rule + " -> " + applyRule(rule, base));
      });

      JPanel controls = new JPanel(new GridLayout(2, 2, 6, 6));
      controls.add(new JLabel("Rule:"));
      controls.add(ruleBox);
      controls.add(new JLabel("Base score:"));
      controls.add(baseSpinner);

      JFrame frame = new JFrame("Polymorphism Challenge");
      frame.add(controls, BorderLayout.NORTH);
      frame.add(result, BorderLayout.CENTER);
      frame.add(scoreButton, BorderLayout.SOUTH);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(420, 200);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
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
