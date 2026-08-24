package chapter07.demo;

import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/** An ArrayList stores data; a JList displays it. */
public class GuiDemo
{
   public static void main(String[] args)
   {
      SwingUtilities.invokeLater(() -> createWindow());
   }

   public static void createWindow()
   {
      ArrayList<String> inventory = new ArrayList<String>();
      DefaultListModel<String> listModel = new DefaultListModel<String>();
      JList<String> itemList = new JList<String>(listModel);
      JTextField itemField = new JTextField(18);
      JButton addButton = new JButton("Add");
      JButton removeButton = new JButton("Remove selected");

      addButton.addActionListener(event -> {
         String item = itemField.getText().trim();
         if (!item.isEmpty())
         {
            inventory.add(item);
            listModel.addElement(item);
            itemField.setText("");
         }
      });

      removeButton.addActionListener(event -> {
         int index = itemList.getSelectedIndex();
         if (index >= 0)
         {
            inventory.remove(index);
            listModel.remove(index);
         }
      });

      JPanel controls = new JPanel();
      controls.add(itemField);
      controls.add(addButton);
      controls.add(removeButton);

      JFrame frame = new JFrame("Chapter 7: Inventory List");
      frame.add(new JScrollPane(itemList), BorderLayout.CENTER);
      frame.add(controls, BorderLayout.SOUTH);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(500, 300);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
   }
}
