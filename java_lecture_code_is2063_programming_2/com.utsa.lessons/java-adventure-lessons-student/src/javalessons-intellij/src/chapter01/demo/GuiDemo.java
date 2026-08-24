package chapter01.demo;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

/** A first Swing program: a window, a label, and an event. */
public class GuiDemo
{
   public static void main(String[] args)
   {
      SwingUtilities.invokeLater(() -> createWindow());
   }

   public static void createWindow()
   {
      JFrame frame = new JFrame("Chapter 1: First GUI");
      JLabel message = new JLabel("The JVM opened this window.", SwingConstants.CENTER);
      JButton button = new JButton("Change the message");

      button.addActionListener(event -> message.setText("The button event ran."));

      frame.add(message, BorderLayout.CENTER);
      frame.add(button, BorderLayout.SOUTH);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(420, 160);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
   }
}
