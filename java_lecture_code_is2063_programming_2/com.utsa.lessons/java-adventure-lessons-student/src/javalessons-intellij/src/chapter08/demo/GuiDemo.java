package chapter08.demo;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/** Compare an alias with an actual copy of an object. */
public class GuiDemo
{
   private static Player original;
   private static Player alias;
   private static Player copy;
   private static JLabel originalLabel;
   private static JLabel aliasLabel;
   private static JLabel copyLabel;

   public static void main(String[] args)
   {
      SwingUtilities.invokeLater(() -> createWindow());
   }

   public static void createWindow()
   {
      JFrame frame = new JFrame("Chapter 8: References");
      originalLabel = new JLabel();
      aliasLabel = new JLabel();
      copyLabel = new JLabel();

      JPanel labels = new JPanel(new GridLayout(3, 1, 4, 4));
      labels.add(originalLabel);
      labels.add(aliasLabel);
      labels.add(copyLabel);

      JButton damageButton = new JButton("Damage original by 10");
      JButton resetButton = new JButton("Reset objects");
      damageButton.addActionListener(event -> {
         original.takeDamage(10);
         refreshLabels();
      });
      resetButton.addActionListener(event -> resetObjects());

      JPanel buttons = new JPanel();
      buttons.add(damageButton);
      buttons.add(resetButton);

      frame.add(labels, BorderLayout.CENTER);
      frame.add(buttons, BorderLayout.SOUTH);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(480, 200);
      frame.setLocationRelativeTo(null);
      resetObjects();
      frame.setVisible(true);
   }

   public static void resetObjects()
   {
      original = new Player("Ida", 100);
      alias = original;
      copy = new Player(original);
      refreshLabels();
   }

   public static void refreshLabels()
   {
      originalLabel.setText("original: " + original);
      aliasLabel.setText("alias:    " + alias + " (same object)");
      copyLabel.setText("copy:     " + copy + " (different object)");
   }
}
