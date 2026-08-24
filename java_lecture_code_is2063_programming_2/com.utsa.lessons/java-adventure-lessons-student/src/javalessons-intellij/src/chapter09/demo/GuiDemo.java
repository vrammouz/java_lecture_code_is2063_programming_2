package chapter09.demo;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/** Split, trim, parse, and rebuild one line of structured text. */
public class GuiDemo
{
   public static void main(String[] args)
   {
      SwingUtilities.invokeLater(() -> createWindow());
   }

   public static void createWindow()
   {
      JFrame frame = new JFrame("Chapter 9: Text Parser");
      JTextField input = new JTextField(
            "Library | Dust in the light | north,east | 12");
      JTextArea output = new JTextArea(8, 42);
      output.setEditable(false);
      JButton parseButton = new JButton("Parse line");

      parseButton.addActionListener(event -> output.setText(parseRoom(input.getText())));

      JPanel top = new JPanel(new GridLayout(2, 1, 4, 4));
      top.add(new JLabel("name | description | exits | coins"));
      top.add(input);

      frame.add(top, BorderLayout.NORTH);
      frame.add(output, BorderLayout.CENTER);
      frame.add(parseButton, BorderLayout.SOUTH);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.pack();
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
   }

   public static String parseRoom(String line)
   {
      String[] parts = line.split("\\|");
      if (parts.length != 4)
         return "Expected exactly four pieces.";

      String name = parts[0].trim();
      String description = parts[1].trim();
      String[] exits = parts[2].trim().split(",");
      int coins;
      try
      {
         coins = Integer.parseInt(parts[3].trim());
      }
      catch (NumberFormatException error)
      {
         return "The coin count must be an integer.";
      }

      StringBuilder result = new StringBuilder();
      result.append(name.toUpperCase()).append("\n");
      result.append(description).append("\nCoins: ").append(coins).append("\nExits:\n");
      for (String exit : exits)
         result.append(" - ").append(exit.trim()).append("\n");
      return result.toString();
   }
}
