import model.Scenery;

import javax.swing.*;
import java.awt.*;
public class Game extends JFrame {

    private Scenery scenery = new Scenery();

    public Game() throws HeadlessException {
        setTitle("Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        addKeyListener(new GameListener(scenery));
    }

    public void display() {
        add(new GraphicsComponent(scenery));
        pack();
        setMinimumSize(getSize());
        setVisible(true);
    }
}
