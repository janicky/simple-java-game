import javax.swing.*;
import java.awt.*;

public class Game extends JFrame {

    public Game() throws HeadlessException {
        setTitle("Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(800, 600);
        setLocationRelativeTo(null);
    }
}
