package chapter11.lab;

import java.awt.BorderLayout;
import java.io.FileNotFoundException;
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
 * GUI CHALLENGE (Ch. 11): keep going after bad input.
 *
 * 1. Load scores_messy.txt and verify total 197, junk 2, blanks 1.
 * 2. Report bad values with their line numbers.
 * 3. Create EmptyLineException.java and throw it for blank lines.
 * 4. Catch that exception separately from NumberFormatException.
 * 5. Rename the data file temporarily and verify a clean error message.
 *
 * THINK: which problem can this method recover from locally, and which
 * problem should be reported to a caller or user?
 */
public class GuiLabStarter
{
   public static void main(String[] args)
   {
      SwingUtilities.invokeLater(() -> createWindow());
   }

   public static void createWindow()
   {
      JFrame frame = new JFrame("Exception Challenge");
      JTextArea output = new JTextArea(16, 44);
      output.setEditable(false);
      JLabel status = new JLabel("Ready.");
      JButton checkButton = new JButton("Check scores_messy.txt");
      checkButton.addActionListener(event -> checkFile(output, status));

      JPanel bottom = new JPanel();
      bottom.add(checkButton);
      bottom.add(status);
      frame.add(new JScrollPane(output), BorderLayout.CENTER);
      frame.add(bottom, BorderLayout.SOUTH);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.pack();
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
   }

   public static void checkFile(JTextArea output, JLabel status)
   {
      int total = 0;
      int valid = 0;
      int junk = 0;
      int blanks = 0;
      int lineNumber = 0;
      output.setText("");

      try (Scanner inputFile = openScores())
      {
         while (inputFile.hasNextLine())
         {
            lineNumber++;
            String line = inputFile.nextLine().trim();

            if (line.isEmpty())
            {
               blanks++;
               output.append("Blank line " + lineNumber + "\n");
            }
            else
            {
               try
               {
                  total += Integer.parseInt(line);
                  valid++;
               }
               catch (NumberFormatException error)
               {
                  junk++;
                  output.append("Junk on line " + lineNumber + ": " + line + "\n");
               }
            }
         }
         status.setText("total=" + total + ", valid=" + valid
               + ", junk=" + junk + ", blanks=" + blanks);
      }
      catch (FileNotFoundException error)
      {
         status.setText("Could not find scores_messy.txt");
      }
   }

   public static Scanner openScores() throws FileNotFoundException
   {
      InputStream resource = GuiLabStarter.class.getResourceAsStream("scores_messy.txt");
      if (resource == null)
         throw new FileNotFoundException("scores_messy.txt resource not found");
      return new Scanner(resource);
   }
}
