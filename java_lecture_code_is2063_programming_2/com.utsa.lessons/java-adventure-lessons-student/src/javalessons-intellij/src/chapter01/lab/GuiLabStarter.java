package chapter01.lab;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

/**
 * GUI CHALLENGE (Ch. 1)
 *
 * Run this first. Then make three changes:
 * 1. Put your name in the window title.
 * 2. Change the opening message.
 * 3. Add a second button that restores the opening message.
 *
 * THINK: which statement changes the component, and which statements only
 * decide where the component appears?
 */
public class GuiLabStarter
{
   public static void main(String[] args)
   {
      SwingUtilities.invokeLater(() -> createWindow());
   }

   public static void createWindow()
   {
      JFrame frame = new JFrame("Chapter 1 Challenge");
      JLabel message = new JLabel("Ready to learn Swing.", SwingConstants.CENTER);
      JButton changeButton = new JButton("Change");

      changeButton.addActionListener(event -> message.setText("A click created an event."));

      frame.add(message, BorderLayout.CENTER);
      frame.add(changeButton, BorderLayout.SOUTH);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(420, 160);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
   }
}
