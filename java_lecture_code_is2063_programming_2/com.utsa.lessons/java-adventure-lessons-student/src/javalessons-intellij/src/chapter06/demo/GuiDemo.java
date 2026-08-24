package chapter06.demo;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/** The GUI displays one Room object at a time. */
public class GuiDemo
{
   private static final Room[] ROOMS = {
      new Room("THE OLD LIBRARY", "Dust hangs in the light.", "north, east"),
      new Room("THE GALLERY", "Portraits watch from both walls.", "south"),
      new Room("THE STOREROOM", "A heavy chest waits here.", "west")
   };

   private static int currentRoom = 0;
   private static JLabel nameLabel;
   private static JLabel descriptionLabel;
   private static JLabel exitsLabel;

   public static void main(String[] args)
   {
      SwingUtilities.invokeLater(() -> createWindow());
   }

   public static void createWindow()
   {
      JFrame frame = new JFrame("Chapter 6: Room Objects");
      nameLabel = new JLabel();
      descriptionLabel = new JLabel();
      exitsLabel = new JLabel();

      JPanel roomPanel = new JPanel(new GridLayout(3, 1, 4, 4));
      roomPanel.add(nameLabel);
      roomPanel.add(descriptionLabel);
      roomPanel.add(exitsLabel);

      JButton nextButton = new JButton("Next room");
      nextButton.addActionListener(event -> {
         currentRoom = (currentRoom + 1) % ROOMS.length;
         showRoom();
      });

      frame.add(roomPanel, BorderLayout.CENTER);
      frame.add(nextButton, BorderLayout.SOUTH);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(470, 190);
      frame.setLocationRelativeTo(null);
      showRoom();
      frame.setVisible(true);
   }

   public static void showRoom()
   {
      Room room = ROOMS[currentRoom];
      nameLabel.setText(room.getName());
      descriptionLabel.setText(room.getDescription());
      exitsLabel.setText("Exits: " + room.getExits());
   }
}
