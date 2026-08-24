package chapter03.demo;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/** Decisions turn one command into one response. */
public class GuiDemo
{
   public static void main(String[] args)
   {
      SwingUtilities.invokeLater(() -> createWindow());
   }

   public static void createWindow()
   {
      JFrame frame = new JFrame("Chapter 3: Command Window");
      JTextField commandField = new JTextField(18);
      JLabel response = new JLabel("Try: look, north, or inventory");
      JButton runButton = new JButton("Run command");

      runButton.addActionListener(event -> {
         String command = commandField.getText().trim().toLowerCase();

         if (command.equals("look"))
            response.setText("Dust hangs in the light.");
         else if (command.equals("north"))
            response.setText("You climb the stair.");
         else if (command.equals("inventory"))
            response.setText("You carry a lantern.");
         else
            response.setText("Unknown command: " + command);
      });

      JPanel controls = new JPanel();
      controls.add(new JLabel("Command:"));
      controls.add(commandField);
      controls.add(runButton);

      frame.add(controls, BorderLayout.NORTH);
      frame.add(response, BorderLayout.CENTER);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(520, 150);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
   }
}
