package chapter03.lab;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 * GUI CHALLENGE (Ch. 3): bug hunt.
 *
 * The "open" branch does not behave reliably.
 * 1. Predict the result for open, OPEN, look, and a blank command.
 * 2. Run all four tests and record what differs from your prediction.
 * 3. Diagnose and fix the String-comparison bug.
 * 4. Make commands ignore surrounding spaces and capitalization.
 * 5. Add inventory and one rule using && or ||.
 */
public class GuiLabStarter
{
   public static void main(String[] args)
   {
      SwingUtilities.invokeLater(() -> createWindow());
   }

   public static void createWindow()
   {
      JFrame frame = new JFrame("Command Bug Hunt");
      JTextField commandField = new JTextField(16);
      JLabel output = new JLabel("Try: open or look");
      JButton runButton = new JButton("Run");

      runButton.addActionListener(event -> {
         String command = commandField.getText();
         boolean hasKey = true;
         boolean hasLantern = false;

         if (command == "open")                 // Intentional bug: diagnose it.
            output.setText("The chest opens.");
         else if (command.equals("look"))
            output.setText("Dusty shelves line the walls.");
         else
            output.setText("Nothing happens.");
      });

      JPanel controls = new JPanel();
      controls.add(new JLabel("Command:"));
      controls.add(commandField);
      controls.add(runButton);

      frame.add(controls, BorderLayout.NORTH);
      frame.add(output, BorderLayout.CENTER);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(500, 150);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
   }
}
