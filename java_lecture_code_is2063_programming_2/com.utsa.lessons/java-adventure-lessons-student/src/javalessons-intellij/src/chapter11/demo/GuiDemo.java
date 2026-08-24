package chapter11.demo;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/** Input errors are handled without closing the window. */
public class GuiDemo
{
   public static void main(String[] args)
   {
      SwingUtilities.invokeLater(() -> createWindow());
   }

   public static void createWindow()
   {
      JFrame frame = new JFrame("Chapter 11: Safe Number Input");
      JTextField numberField = new JTextField(12);
      JLabel result = new JLabel("Enter an integer.");
      JButton doubleButton = new JButton("Double it");

      doubleButton.addActionListener(event -> {
         try
         {
            int number = Integer.parseInt(numberField.getText().trim());
            result.setText(number + " doubled is " + (number * 2));
         }
         catch (NumberFormatException error)
         {
            result.setText("That is not a valid integer. Try again.");
            numberField.selectAll();
            numberField.requestFocusInWindow();
         }
      });

      JPanel controls = new JPanel();
      controls.add(numberField);
      controls.add(doubleButton);
      frame.add(controls, BorderLayout.NORTH);
      frame.add(result, BorderLayout.CENTER);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(460, 150);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
   }
}
