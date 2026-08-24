package chapter04.lab;

import java.awt.BorderLayout;
import java.io.InputStream;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 * GUI CHALLENGE (Ch. 4)
 *
 * 1. Load every line of items.txt and number the displayed items.
 * 2. Report the total.
 * 3. Make Search report whether the typed item exists by reading the file.
 * 4. Make matching ignore case and surrounding spaces.
 * 5. Add a Clear button.
 *
 * THINK: this starter reopens the file for every search. What structure from
 * a later chapter could store the items after one read, and why would it help?
 */
public class GuiLabStarter
{
   public static void main(String[] args)
   {
      SwingUtilities.invokeLater(() -> createWindow());
   }

   public static void createWindow()
   {
      JFrame frame = new JFrame("Item File Challenge");
      JTextArea output = new JTextArea(14, 40);
      output.setEditable(false);
      JTextField searchField = new JTextField(14);
      JLabel result = new JLabel("Load the file first.");
      JButton loadButton = new JButton("Load items.txt");
      JButton searchButton = new JButton("Search");

      loadButton.addActionListener(event -> loadItems(output, result));
      searchButton.addActionListener(event -> searchFile(searchField.getText(), result));

      JPanel controls = new JPanel();
      controls.add(loadButton);
      controls.add(searchField);
      controls.add(searchButton);
      controls.add(result);

      frame.add(new JScrollPane(output), BorderLayout.CENTER);
      frame.add(controls, BorderLayout.SOUTH);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.pack();
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
   }

   public static void loadItems(JTextArea output, JLabel result)
   {
      output.setText("");
      int count = 0;

      InputStream resource = GuiLabStarter.class.getResourceAsStream("items.txt");
      if (resource == null)
      {
         result.setText("Could not find the packaged items.txt resource");
         return;
      }

      try (Scanner inputFile = new Scanner(resource))
      {
         while (inputFile.hasNextLine())
         {
            count++;
            output.append(count + ". " + inputFile.nextLine() + "\n");
         }

         result.setText("Total: " + count);
      }
   }

   public static void searchFile(String text, JLabel result)
   {
      String target = text.trim();
      boolean found = false;

      InputStream resource = GuiLabStarter.class.getResourceAsStream("items.txt");
      if (resource == null)
      {
         result.setText("Could not find the packaged items.txt resource");
         return;
      }

      try (Scanner inputFile = new Scanner(resource))
      {
         while (inputFile.hasNextLine())
         {
            if (inputFile.nextLine().trim().equalsIgnoreCase(target))
               found = true;
         }
         result.setText(found ? "Found: " + target : "Not found: " + target);
      }
   }
}
