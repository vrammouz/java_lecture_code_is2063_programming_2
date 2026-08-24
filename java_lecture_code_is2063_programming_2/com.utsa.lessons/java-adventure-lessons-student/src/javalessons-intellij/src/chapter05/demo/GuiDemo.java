package chapter05.demo;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

/** Small methods keep event-handling code readable. */
public class GuiDemo
{
   private static int health = 100;
   private static int coins = 0;
   private static JLabel status;

   public static void main(String[] args)
   {
      SwingUtilities.invokeLater(() -> createWindow());
   }

   public static void createWindow()
   {
      JFrame frame = new JFrame("Chapter 5: Method Controls");
      status = new JLabel(formatStatus(), SwingConstants.CENTER);
      JButton takeButton = new JButton("Take coins");
      JButton wadeButton = new JButton("Wade");
      JButton resetButton = new JButton("Reset");

      takeButton.addActionListener(event -> takeCoins());
      wadeButton.addActionListener(event -> takeDamage(10));
      resetButton.addActionListener(event -> reset());

      JPanel buttons = new JPanel(new GridLayout(1, 3, 6, 6));
      buttons.add(takeButton);
      buttons.add(wadeButton);
      buttons.add(resetButton);

      frame.add(status, BorderLayout.CENTER);
      frame.add(buttons, BorderLayout.SOUTH);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(460, 150);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
   }

   public static void takeCoins()
   {
      coins += 5;
      refreshStatus();
   }

   public static void takeDamage(int points)
   {
      health -= points;
      refreshStatus();
   }

   public static void reset()
   {
      health = 100;
      coins = 0;
      refreshStatus();
   }

   public static String formatStatus()
   {
      return "Health: " + health + "   Coins: " + coins;
   }

   public static void refreshStatus()
   {
      status.setText(formatStatus());
   }
}
