package chapter04.demo;

import java.awt.BorderLayout;
import java.io.InputStream;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

/** A loop reads every line of rooms.txt into a GUI. */
public class GuiDemo
{
   public static void main(String[] args)
   {
      SwingUtilities.invokeLater(() -> createWindow());
   }

   public static void createWindow()
   {
      JFrame frame = new JFrame("Chapter 4: File Viewer");
      JTextArea output = new JTextArea(14, 45);
      output.setEditable(false);
      JButton loadButton = new JButton("Load rooms.txt");

      loadButton.addActionListener(event -> loadFile(output));

      frame.add(new JScrollPane(output), BorderLayout.CENTER);
      frame.add(loadButton, BorderLayout.SOUTH);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.pack();
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
   }

   public static void loadFile(JTextArea output)
   {
      output.setText("");
      int lineNumber = 0;

      InputStream resource = GuiDemo.class.getResourceAsStream("rooms.txt");
      if (resource == null)
      {
         output.setText("Could not find the packaged rooms.txt resource.");
         return;
      }

      try (Scanner inputFile = new Scanner(resource))
      {
         while (inputFile.hasNextLine())
         {
            lineNumber++;
            output.append(lineNumber + ": " + inputFile.nextLine() + "\n");
         }
         output.append("\nLines read: " + lineNumber);
      }
   }
}
