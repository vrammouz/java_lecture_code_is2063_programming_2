package chapter09.lab;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.io.InputStream;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

/**
 * GUI CHALLENGE (Ch. 9): turn messy text into a clean report.
 *
 * 1. Split each nonblank line of rooms_messy.txt on the pipe.
 * 2. Trim every piece and parse the coin count.
 * 3. List exits one per line.
 * 4. Total all coins (expected: 20).
 * 5. Use one StringBuilder for the final report.
 *
 * THINK: what assumptions does the parser make about each line? Write one
 * malformed test line and predict exactly where this version fails.
 */
public class GuiLabStarter
{
   public static void main(String[] args)
   {
      SwingUtilities.invokeLater(() -> createWindow());
   }

   public static void createWindow()
   {
      JFrame frame = new JFrame("Messy Text Challenge");
      JTextArea output = new JTextArea(18, 48);
      output.setEditable(false);
      JLabel status = new JLabel("Ready.");
      JButton loadButton = new JButton("Build report");

      loadButton.addActionListener(event -> buildReport(output, status));

      JPanel bottom = new JPanel(new GridLayout(1, 2, 6, 6));
      bottom.add(loadButton);
      bottom.add(status);
      frame.add(new JScrollPane(output), BorderLayout.CENTER);
      frame.add(bottom, BorderLayout.SOUTH);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.pack();
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
   }

   public static void buildReport(JTextArea output, JLabel status)
   {
      StringBuilder report = new StringBuilder();
      int totalCoins = 0;
      int roomCount = 0;

      InputStream resource = GuiLabStarter.class.getResourceAsStream("rooms_messy.txt");
      if (resource == null)
      {
         status.setText("Could not find the packaged rooms_messy.txt resource");
         return;
      }

      try (Scanner inputFile = new Scanner(resource))
      {
         while (inputFile.hasNextLine())
         {
            String line = inputFile.nextLine().trim();
            if (!line.isEmpty())
            {
               String[] parts = line.split("\\|");
               String name = parts[0].trim();
               int coins = Integer.parseInt(parts[3].trim());
               roomCount++;
               totalCoins += coins;
               report.append(name).append(" — ").append(coins).append(" coins\n");
            }
         }
         output.setText(report.toString());
         status.setText(roomCount + " rooms, " + totalCoins + " coins");
      }
   }
}
