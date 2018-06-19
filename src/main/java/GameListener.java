import model.Scenery;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameListener implements KeyListener {

    private Scenery scenery;
    private Game game;
    private int ox = 0;
    private int oy = 0;

    public GameListener(Game game, Scenery scenery) {
        this.game = game;
        this.scenery = scenery;
    }

    public void keyTyped(KeyEvent e) {

    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            oy = -2;
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            oy = 2;
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            ox = -2;
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            ox = 2;
        }
        updateLocation();
    }

    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_DOWN) {
            oy = 0;
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT || e.getKeyCode() == KeyEvent.VK_RIGHT) {
            ox = 0;
        }
        updateLocation();
    }

    private void updateLocation() {
        scenery.getPlayer().move(ox, oy);
        game.display();
    }
}
