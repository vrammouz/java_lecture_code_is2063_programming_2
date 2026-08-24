package chapter10.demo;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/** Different button actions share one interface and one loop. */
public class GuiDemo
{
   public interface GuiCommand
   {
      String getWord();
      String getResponse();
   }

   public static class LookGuiCommand implements GuiCommand
   {
      public String getWord() { return "look"; }
      public String getResponse() { return "Dust hangs in the light."; }
   }

   public static class NorthGuiCommand implements GuiCommand
   {
      public String getWord() { return "north"; }
      public String getResponse() { return "You climb the stair."; }
   }

   public static class InventoryGuiCommand implements GuiCommand
   {
      public String getWord() { return "inventory"; }
      public String getResponse() { return "You carry a lantern."; }
   }

   public static void main(String[] args)
   {
      SwingUtilities.invokeLater(() -> createWindow());
   }

   public static void createWindow()
   {
      ArrayList<GuiCommand> commands = new ArrayList<GuiCommand>();
      commands.add(new LookGuiCommand());
      commands.add(new NorthGuiCommand());
      commands.add(new InventoryGuiCommand());

      JFrame frame = new JFrame("Chapter 10: Polymorphic Buttons");
      JLabel output = new JLabel("Choose a command.");
      JPanel buttons = new JPanel(new GridLayout(1, commands.size(), 6, 6));

      for (GuiCommand command : commands)
      {
         JButton button = new JButton(command.getWord());
         button.addActionListener(event -> output.setText(command.getResponse()));
         buttons.add(button);
      }

      frame.add(output, BorderLayout.CENTER);
      frame.add(buttons, BorderLayout.SOUTH);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(500, 160);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
   }
}
