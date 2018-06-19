import model.Scenery;

import javax.swing.*;
import java.awt.*;
public class Game extends JFrame {

    private Scenery scenery = new Scenery();
    private GraphicsComponent gc = new GraphicsComponent(scenery);

    public Game() throws HeadlessException {
        setTitle("Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        addKeyListener(new GameListener(this, scenery));
    }

    public void display() {
        gc = new GraphicsComponent(scenery);
        remove(gc);
        add(gc);
        repaint();
        pack();
        setMinimumSize(getSize());
        setVisible(true);
    }

    public void repaint() {

    }
}
