package safespaceapp;

/**
 * The single class that launches the whole SafeSpace project.
 *
 * Author: Mourice Offor
 */
public class SafeSpaceApp {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new MainMenu().setVisible(true));
    }
}
