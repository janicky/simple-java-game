import javax.swing.*;
import java.awt.*;
public class Game extends JFrame {

    public Game() throws HeadlessException {
        setTitle("Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        addKeyListener(new GameListener(this));
    }

    public void display() {
        add(new GraphicsComponent());
        pack();
        setMinimumSize(getSize());
        setVisible(true);
    }
}
