package chapter08.lab;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 * GUI CHALLENGE (Ch. 8): aliasing bug hunt.
 *
 * The backup should preserve 200 coins after the vault is emptied, but it
 * does not.
 * 1. Predict all three labels after Raid.
 * 2. Draw the objects and reference arrows before changing the code.
 * 3. Add a copy constructor and equals method to Chest.
 * 4. Fix makeBackup so it creates a second object.
 * 5. Display both == and equals results for two equal-but-distinct chests.
 */
public class GuiLabStarter
{
   private static Chest vault;
   private static Chest backup;
   private static JLabel vaultLabel;
   private static JLabel backupLabel;
   private static JLabel identityLabel;

   public static void main(String[] args)
   {
      SwingUtilities.invokeLater(() -> createWindow());
   }

   public static void createWindow()
   {
      JFrame frame = new JFrame("Reference Bug Hunt");
      vaultLabel = new JLabel();
      backupLabel = new JLabel();
      identityLabel = new JLabel();

      JPanel labels = new JPanel(new GridLayout(3, 1, 4, 4));
      labels.add(vaultLabel);
      labels.add(backupLabel);
      labels.add(identityLabel);

      JButton raidButton = new JButton("Raid: take 200");
      JButton resetButton = new JButton("Reset");
      raidButton.addActionListener(event -> {
         vault.take(200);
         refreshLabels();
      });
      resetButton.addActionListener(event -> resetChests());

      JPanel buttons = new JPanel();
      buttons.add(raidButton);
      buttons.add(resetButton);
      frame.add(labels, BorderLayout.CENTER);
      frame.add(buttons, BorderLayout.SOUTH);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(500, 200);
      frame.setLocationRelativeTo(null);
      resetChests();
      frame.setVisible(true);
   }

   public static void resetChests()
   {
      vault = new Chest("vault", 200);
      backup = makeBackup(vault);
      refreshLabels();
   }

   public static Chest makeBackup(Chest original)
   {
      return original;                         // Intentional aliasing bug.
   }

   public static void refreshLabels()
   {
      vaultLabel.setText("Vault: " + vault);
      backupLabel.setText("Backup: " + backup);
      identityLabel.setText("Same object with == : " + (vault == backup));
   }
}
