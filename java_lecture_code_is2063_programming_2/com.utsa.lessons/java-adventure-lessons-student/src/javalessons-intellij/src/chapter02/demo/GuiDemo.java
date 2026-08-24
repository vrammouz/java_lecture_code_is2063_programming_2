package chapter02.demo;

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

/** Variables and input, using Swing components instead of Scanner. */
public class GuiDemo
{
   public static final int MAX_CARRY = 5;

   public static void main(String[] args)
   {
      SwingUtilities.invokeLater(() -> createWindow());
   }

   public static void createWindow()
   {
      JFrame frame = new JFrame("Chapter 2: Player Card");
      JTextField nameField = new JTextField();
      JSpinner coinsSpinner = new JSpinner(new SpinnerNumberModel(0, 0, 999, 1));
      JTextArea output = new JTextArea(6, 32);
      output.setEditable(false);
      output.setLineWrap(true);
      output.setWrapStyleWord(true);

      JPanel form = new JPanel(new GridLayout(2, 2, 6, 6));
      form.add(new JLabel("Player name:"));
      form.add(nameField);
      form.add(new JLabel("Coins:"));
      form.add(coinsSpinner);

      JButton buildButton = new JButton("Build card");
      buildButton.addActionListener(event -> {
         String name = nameField.getText().trim();
         int coins = (Integer) coinsSpinner.getValue();
         String card = String.format(
               "THE OLD LIBRARY%nWelcome, %s.%nCoins: %d%nCarry limit: %d",
               name, coins, MAX_CARRY);
         output.setText(card);
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
