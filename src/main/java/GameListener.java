import model.Scenery;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameListener implements KeyListener {

    private Scenery scenery;
    private GraphicsComponent gc;
    private int ox = 0;
    private int oy = 0;

    public GameListener(GraphicsComponent gc, Scenery scenery) {
        this.gc = gc;
        this.scenery = scenery;
    }

    public void keyTyped(KeyEvent e) {

    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            oy = 1;
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            oy = -1;
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            ox = -1;
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            ox = 1;
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
    }
}
