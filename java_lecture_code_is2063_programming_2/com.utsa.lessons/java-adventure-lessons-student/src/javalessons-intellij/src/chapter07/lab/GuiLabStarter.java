package chapter07.lab;

import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 * GUI CHALLENGE (Ch. 7): inventory with a capacity.
 *
 * 1. Refuse a fifth item and show a useful message.
 * 2. Refuse blank items and duplicate items.
 * 3. Remove the selected item when Drop is clicked.
 * 4. Keep the ArrayList, JList model, and status label in agreement.
 * 5. Explain which structure owns the data and which only displays it.
 */
public class GuiLabStarter
{
   public static final int MAX_ITEMS = 4;

   public static void main(String[] args)
   {
      SwingUtilities.invokeLater(() -> createWindow());
   }

   public static void createWindow()
   {
      ArrayList<String> bag = new ArrayList<String>();
      DefaultListModel<String> model = new DefaultListModel<String>();
      JList<String> list = new JList<String>(model);
      JTextField itemField = new JTextField(14);
      JLabel status = new JLabel("0 / " + MAX_ITEMS);
      JButton addButton = new JButton("Pick up");
      JButton dropButton = new JButton("Drop selected");

      addButton.addActionListener(event -> {
         String item = itemField.getText().trim();
         if (!item.isEmpty() && !bag.contains(item) && bag.size() < MAX_ITEMS)
         {
            bag.add(item);
            model.addElement(item);
            itemField.setText("");
         }
         status.setText(bag.size() + " / " + MAX_ITEMS);
      });

      dropButton.addActionListener(event -> {
         int index = list.getSelectedIndex();
         if (index >= 0)
         {
            bag.remove(index);
            model.remove(index);
         }
         status.setText(bag.size() + " / " + MAX_ITEMS);
      });

      JPanel controls = new JPanel();
      controls.add(itemField);
      controls.add(addButton);
      controls.add(dropButton);
      controls.add(status);

      JFrame frame = new JFrame("Inventory Challenge");
      frame.add(new JScrollPane(list), BorderLayout.CENTER);
      frame.add(controls, BorderLayout.SOUTH);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(560, 300);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
   }
}
