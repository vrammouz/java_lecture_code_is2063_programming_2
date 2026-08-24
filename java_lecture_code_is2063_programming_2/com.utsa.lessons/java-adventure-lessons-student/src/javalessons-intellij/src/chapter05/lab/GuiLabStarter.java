package chapter05.lab;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 * GUI CHALLENGE (Ch. 5): refactor without changing behavior.
 *
 * This works, but createWindow contains too much behavior.
 * 1. Save the result of this test: take, wade, take, reset.
 * 2. Extract at least four clearly named methods.
 * 3. At least one method must take a parameter.
 * 4. At least one method must return a value.
 * 5. createWindow should mainly create and arrange components.
 *
 * THINK: which version would be safer to change six weeks from now, and
 * what evidence in the code supports your answer?
 */
public class GuiLabStarter
{
   private static int health = 100;
   private static int coins = 0;

   public static void main(String[] args)
   {
      SwingUtilities.invokeLater(() -> createWindow());
   }

   public static void createWindow()
   {
      JFrame frame = new JFrame("Method Refactoring Challenge");
      JLabel status = new JLabel("Health: 100   Coins: 0");
      JButton takeButton = new JButton("Take 5 coins");
      JButton wadeButton = new JButton("Wade");
      JButton resetButton = new JButton("Reset");

      takeButton.addActionListener(event -> {
         coins = coins + 5;
         status.setText("Health: " + health + "   Coins: " + coins);
      });
      wadeButton.addActionListener(event -> {
         health = health - 10;
         status.setText("Health: " + health + "   Coins: " + coins);
      });
      resetButton.addActionListener(event -> {
         health = 100;
         coins = 0;
         status.setText("Health: " + health + "   Coins: " + coins);
      });

      JPanel buttons = new JPanel();
      buttons.add(takeButton);
      buttons.add(wadeButton);
      buttons.add(resetButton);
      frame.add(status, BorderLayout.CENTER);
      frame.add(buttons, BorderLayout.SOUTH);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(500, 160);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
   }
}
