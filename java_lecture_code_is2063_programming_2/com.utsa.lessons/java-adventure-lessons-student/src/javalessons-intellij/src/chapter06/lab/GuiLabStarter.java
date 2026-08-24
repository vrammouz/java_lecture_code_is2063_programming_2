package chapter06.lab;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingUtilities;

/**
 * GUI CHALLENGE (Ch. 6)
 *
 * The starter creates and displays Item objects.
 * 1. Finish Player.java as required by Lab5_Starter.java.
 * 2. Add fields for a Player name and damage amount.
 * 3. Create one Player when the button is clicked.
 * 4. Display the Player by calling its accessor methods.
 * 5. Add a Damage button that calls takeDamage.
 *
 * THINK: should the GUI read private fields directly? Explain using the
 * responsibility of the Player class, not only the word "private."
 */
public class GuiLabStarter
{
   public static void main(String[] args)
   {
      SwingUtilities.invokeLater(() -> createWindow());
   }

   public static void createWindow()
   {
      JFrame frame = new JFrame("Object Builder Challenge");
      JTextField nameField = new JTextField();
      JSpinner weightSpinner = new JSpinner(new SpinnerNumberModel(1, 0, 100, 1));
      JLabel result = new JLabel("Create an item.");
      JButton createButton = new JButton("Create Item");

      createButton.addActionListener(event -> {
         Item item = new Item(nameField.getText().trim(), (Integer) weightSpinner.getValue());
         result.setText(item.getName() + " weighs " + item.getWeight());
      });

      JPanel form = new JPanel(new GridLayout(2, 2, 6, 6));
      form.add(new JLabel("Item name:"));
      form.add(nameField);
      form.add(new JLabel("Weight:"));
      form.add(weightSpinner);

      frame.add(form, BorderLayout.NORTH);
      frame.add(result, BorderLayout.CENTER);
      frame.add(createButton, BorderLayout.SOUTH);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(460, 190);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
   }
}
