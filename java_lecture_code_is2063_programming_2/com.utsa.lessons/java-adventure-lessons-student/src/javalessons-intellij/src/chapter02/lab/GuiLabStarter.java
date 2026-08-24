package chapter02.lab;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingUtilities;

/**
 * GUI CHALLENGE (Ch. 2)
 *
 * Finish a player card without using if statements or loops.
 * 1. Add a named constant MAX_CARRY with value 5.
 * 2. Add one more text field of your choice.
 * 3. Include every input and MAX_CARRY in the output.
 * 4. Use String.format instead of a chain of print statements.
 *
 * THINK: which values can change while the program runs, and which cannot?
 */
public class GuiLabStarter
{
   public static final int MAX_CARRY = 5;

   public static void main(String[] args)
   {
      SwingUtilities.invokeLater(() -> createWindow());
   }

   public static void createWindow()
   {
      JFrame frame = new JFrame("Player Card Challenge");
      JTextField nameField = new JTextField();
      JSpinner coinsSpinner = new JSpinner(new SpinnerNumberModel(0, 0, 999, 1));
      JTextArea output = new JTextArea(6, 34);
      output.setEditable(false);

      JPanel form = new JPanel(new GridLayout(2, 2, 6, 6));
      form.add(new JLabel("Name:"));
      form.add(nameField);
      form.add(new JLabel("Coins:"));
      form.add(coinsSpinner);

      JButton buildButton = new JButton("Build card");
      buildButton.addActionListener(event -> {
         String name = nameField.getText().trim();
         int coins = (Integer) coinsSpinner.getValue();
         output.setText(String.format(
               "Player: %s%nCoins: %d%nCarry limit: %d",
               name, coins, MAX_CARRY));
      });

      frame.add(form, BorderLayout.NORTH);
      frame.add(output, BorderLayout.CENTER);
      frame.add(buildButton, BorderLayout.SOUTH);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.pack();
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
   }
}
